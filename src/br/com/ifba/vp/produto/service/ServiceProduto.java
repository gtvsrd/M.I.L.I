package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.model.dao.DaoProduto;
import br.com.ifba.vp.produto.model.dao.IDaoProduto;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ServiceProduto implements IServiceProduto {
    private final IDaoProduto daoProduto = new DaoProduto();
    
    @Override
    public Produto saveProduto(Produto produto) {
        return this.daoProduto.save(produto);
    }

    @Override
    public Produto updateProduto(Produto produto) {
        return this.daoProduto.update(produto);
    }

    @Override
    public void deleteProduto(Produto produto) {
        this.daoProduto.delete(produto);
    }

    @Override
    public List<Produto> findAllProduto() {
        return this.daoProduto.findAll();
    }

    @Override
    public Produto findByIdProduto(Long id) {
        return this.daoProduto.findById(id);
    }
    
    @Override
    public List<Produto> findByNomeProduto(String nome) {
        return this.daoProduto.findByNomeProduto(nome);
    }
    
    @Override
    public Produto findByCodigoProduto(Long codigo) {
        return this.daoProduto.findByCodigoProduto(codigo);
    }
}
