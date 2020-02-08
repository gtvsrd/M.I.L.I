/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IServiceProduto {
    public abstract Produto saveProduto(Produto produto);
    public abstract Produto updateProduto(Produto produto);
    public abstract void deleteProduto(Produto produto);
    public abstract List<Produto> findAllProduto();
    public abstract Produto findByIdProduto(Long id);
    public abstract List<Produto> findByNomeProduto(String nome);
    public abstract Produto findByCodigoProduto(Long codigo);
}
