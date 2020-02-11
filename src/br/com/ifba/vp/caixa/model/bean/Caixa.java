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
