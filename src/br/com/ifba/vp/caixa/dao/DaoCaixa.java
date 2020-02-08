/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.dao;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.infrastructure.dao.GenericDao;
import java.util.List;

/**
 *
 * @author gusta
 */
public class DaoCaixa extends GenericDao<Caixa> implements IDaoCaixa{
    @Override
    public Caixa findByCpfCaixa(String cpf) {
        String query = "select caixa from Caixa caixa WHERE caixa.cpf = "+ cpf +"";
        return (Caixa) entityManager.createQuery(query).getSingleResult();
    }
    @Override
    public List<Caixa> findByCpfSenhaCaixa(Caixa caixa) {
        
        String query = "select caixa from Caixa caixa WHERE caixa.cpf = "+ caixa.getCpf() +" and senha = "+ caixa.getSenha() +" ";
        return GenericDao.entityManager.createQuery(query).getResultList();
    }

}
