/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;

/**
 *
 * @author gusta
 */
public interface IServiceFornecedor {
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
}
