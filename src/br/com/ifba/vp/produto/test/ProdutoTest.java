/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.test;

import br.com.ifba.vp.infrastructure.connection.ConnectionFactory;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.model.dao.ProdutoDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gusta
 */
public class ProdutoTest {
    public static void main(String[] args) {
        
        ProdutoDAO dao = new ProdutoDAO();
        
        dao.remove(1);
    }
}
