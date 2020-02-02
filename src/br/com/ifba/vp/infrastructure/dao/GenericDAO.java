/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.dao;

import br.com.ifba.vp.infrastructure.model.AbstractEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author gusta
 */
public abstract class GenericDAO<T, I extends AbstractEntity> {

   protected EntityManager entityManager;

   private Class<T> persistedClass;

   protected GenericDAO() {
   }

   protected GenericDAO(Class<T> persistedClass) {
       this();
       this.persistedClass = persistedClass;
   }

   public T salvar(T entity) {
       EntityTransaction t = entityManager.getTransaction();
       t.begin();
       entityManager.persist(entity);
       entityManager.flush();
       t.commit();
       return entity;
   }

   public T atualizar(T entity) {
       EntityTransaction t = entityManager.getTransaction();
       t.begin();
       entityManager.merge(entity);
       entityManager.flush();
       t.commit();
       return entity;
   }

   public void remover(I id) {
       T entity = encontrar(id);
       EntityTransaction tx = entityManager.getTransaction();
       tx.begin();
       T mergedEntity = entityManager.merge(entity);
       entityManager.remove(mergedEntity);
       entityManager.flush();
       tx.commit();
   }

   public List<T> getList() {
       CriteriaBuilder builder = entityManager.getCriteriaBuilder();
       CriteriaQuery<T> query = builder.createQuery(persistedClass);
       query.from(persistedClass);
       return entityManager.createQuery(query).getResultList();
   }

   public T encontrar(I id) {
       return entityManager.find(persistedClass, id);
   }
}
