/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.model.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gusta
 */
public class CaixaTest {
    public static void main(String[] args) {

        Long senha = 40028922L;
        Caixa c = new Caixa();
        c.setSenha(senha);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mili");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
}
