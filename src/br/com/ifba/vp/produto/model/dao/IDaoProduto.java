/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.model.dao;

import br.com.ifba.vp.infrastructure.dao.IGenericDao;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoProduto extends IGenericDao<Produto> {
    public abstract List<Produto> findByNomeProduto(String nome);
    public abstract Produto findByCodigoProduto(Long codigo);
}
