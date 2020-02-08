/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.model.bean;

import br.com.ifba.vp.infrastructure.connection.Funcionario;
import javax.persistence.Entity;

/**
 *
 * @author Icaro
 */

@Entity
public class Caixa extends Funcionario{
    
    protected String especializacao;

    public String getEspecializacao() {
        return especializacao;
    }
    
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
      
}
