package br.com.ifba.vp.produto.model.dao;

import br.com.ifba.vp.infrastructure.dao.GenericDao;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author gusta
 */
public class DaoProduto extends GenericDao<Produto> implements IDaoProduto {

    @Override
    public List<Produto> findByNomeProduto(String nome) {
        String query = "select produto from Produto produto WHERE produto.nome like '" + nome +"%'";
        return entityManager.createQuery(query).getResultList();
    }
    
    @Override
    public Produto findByCodigoProduto(Long codigo) {
        String query = "select produto from Produto produto WHERE produto.codigoBarras = " + codigo +"";
        return (Produto) entityManager.createQuery(query).getSingleResult();
    }
}
