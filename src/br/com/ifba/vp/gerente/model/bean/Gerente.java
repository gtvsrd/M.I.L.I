/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.model.bean;

import br.com.ifba.vp.infrastructure.connection.Funcionario;
import br.com.ifba.vp.infrastructure.pessoa.Endereco;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Icaro
 */
@Entity
public class Gerente extends Funcionario {
    @OneToOne
    private Endereco endereco;
    void CadastroFornecedor(){
        
    }
    
    void CadastroFuncionario(){
        
    }

    @Override
    public void CadastroCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CadastroProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ControleEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
