package br.com.ifba.vp.produto.model.bean;

import br.com.ifba.vp.infrastructure.model.AbstractEntity;
import javax.persistence.Entity;

/**
 *
 * @author Icaro
 */

@Entity
public class Produto extends AbstractEntity {
    
    private String nome;
    private Long lote;
    private Double preco;
    private String genero;
    private Long secao;
    private String dataValidade;
    private Long codigoBarras;

    public Long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    public void setSecao(Long secao) {
        this.secao = secao;
    }
    
    public Long getSecao() {
        return secao;
    }
    
    public void setLote(Long lote) {
        this.lote = lote;
    }
    
    public Long getLote() {
        return lote;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
      
}
