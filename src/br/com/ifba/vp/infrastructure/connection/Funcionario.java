/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.connection;

import br.com.ifba.vp.infrastructure.pessoa.Pessoa;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Icaro
 */
@Entity
public abstract class Funcionario extends Pessoa {
    
    protected Boolean gerente;
    protected String email;
    protected Long senha;
    
    @Column(nullable = true)
    protected String especializacao;

    public String getEspecializacao() {
        return especializacao;
    }
    
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public Boolean getGerente() {
        return gerente;
    }

    public void setGerente(Boolean gerente) {
        this.gerente = gerente;
    }
    
    public abstract void CadastroCliente();
    
    public abstract void CadastroProduto();
    
    public abstract void ControleEstoque();
}
