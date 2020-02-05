/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.dao;

import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.infrastructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class DaoGerente extends GenericDAO<Gerente> implements IDaoGerente {

    @Override
    public List<Gerente> findByIdSenhaGerente(Gerente gerente) {
        String query = "select caixa from Caixa caixa WHERE caixa.id = "+ gerente.getId() +" and senha = "+ gerente.getSenha() +" ";
        return GenericDAO.entityManager.createQuery(query).getResultList();
    }
    
}
