/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.fornecedor.dao.DaoFornecedor;
import br.com.ifba.vp.fornecedor.dao.IDaoFornecedor;

/**
 *
 * @author gusta
 */
public class ServiceFornecedor implements IServiceFornecedor {
    private final IDaoFornecedor daoFornecedor = new DaoFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return this.daoFornecedor.save(fornecedor);
    }
}
