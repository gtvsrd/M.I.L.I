/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.connection;

import br.com.ifba.vp.infrastructure.pessoa.Pessoa;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Icaro
 */

@MappedSuperclass
public abstract class Funcionario extends Pessoa {
    
    protected String email;
    protected Long senha;

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
}
