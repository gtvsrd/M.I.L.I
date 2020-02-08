/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.login.service;

import br.com.ifba.vp.caixa.dao.DaoCaixa;
import br.com.ifba.vp.caixa.model.bean.Caixa;

import br.com.ifba.vp.gerente.dao.DaoGerente;
import br.com.ifba.vp.gerente.model.bean.Gerente;

import br.com.ifba.vp.infrastructure.exception.BusinessException;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class ServiceLogin implements IServiceLogin {
    public final static String FUNCIONARIO_NULL = "Funcionario null";
    public final static String FUNCIONARIO_NAO_EXISTE = "Funcionario não existe";
    public final static String SENHA_NULL = "Senha null";
    // Representa a mensagem de erro se o Grupo de Pesquisa for nulo.
    public final static String CPF_NULL = "CPF null";
    // Representa a mensagem de erro se o Grupo de Pesquisa já existir.
    public final static String CPF_NAO_EXISTE = "Este CPF não existe na base de dados";
    // Representa a mensagem de erro se o Grupo de Pesquisa for inválido.
    public final static String CPF_INVALIDO = "CPF inválido"; 

    
    
    @Override
    public Integer Login(String cpf, Long senha) {
        if(cpf == null) {
            JOptionPane.showMessageDialog(null, CPF_NULL, "Erro", 1);
            throw new BusinessException(CPF_NULL);
        }
        if(senha == null) {
            JOptionPane.showMessageDialog(null, SENHA_NULL, "Erro", 1);
            throw new BusinessException(SENHA_NULL);
        }
        
        Caixa caixa = new Caixa();
        caixa.setCpf(cpf);
        caixa.setSenha(senha);
        DaoCaixa daoCaixa = new DaoCaixa();
        
        if(daoCaixa.findByCpfSenhaCaixa(caixa).isEmpty()){
            
            Gerente gerente = new Gerente();
            gerente.setCpf(cpf);
            gerente.setSenha(senha);
            DaoGerente daoGerente = new DaoGerente();
            
            if(daoGerente.findByCpfSenhaGerente(gerente).isEmpty()) {
                JOptionPane.showMessageDialog(null, FUNCIONARIO_NAO_EXISTE, "Erro", 1);
                throw new BusinessException(FUNCIONARIO_NAO_EXISTE);
            } else { 
                return 2; 
            }
        } else {
            return 1;
        }
    }
}
