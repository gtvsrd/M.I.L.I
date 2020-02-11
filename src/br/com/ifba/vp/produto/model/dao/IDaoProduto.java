package br.com.ifba.vp.produto.model.dao;

import br.com.ifba.vp.infrastructure.dao.IGenericDao;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoProduto extends IGenericDao<Produto> {
    //Função que retorna um produto a partir do Nome enviado; usado na tela de verificação de estoque.
    public abstract List<Produto> findByNomeProduto(String nome);
    //Função que retorna um Produto a partir do Código de Barras enviado; usado na tela do Caixa.
    public abstract Produto findByCodigoProduto(Long codigo);
}
