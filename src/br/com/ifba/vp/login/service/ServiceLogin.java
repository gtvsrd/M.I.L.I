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
    // Representa a mensagem de erro se o Funcionário não existir na base de dados.
    public final static String FUNCIONARIO_NAO_EXISTE = "Funcionario não existe";
    // Representa a mensagem de erro se a Senha for nula.
    public final static String SENHA_NULL = "Senha null";
    // Representa a mensagem de erro se o CPF for nulo.
    public final static String CPF_NULL = "CPF null";    
    
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
        
        // Se os campos de Cpf e Senha foram devidamente preenchidos, cria um objeto Caixa e um DaoCaixa
        Caixa caixa = new Caixa();
        caixa.setCpf(cpf);
        caixa.setSenha(senha);
        DaoCaixa daoCaixa = new DaoCaixa();
        
        // Teste para verificar se um Caixa com o Cpf e a Senha passados existe no banco de dados
        if(daoCaixa.findByCpfSenhaCaixa(caixa).isEmpty()){
            // Caso não exista um Caixa com as características informadas, cria um Gerente e um DaoGerente
            Gerente gerente = new Gerente();
            gerente.setCpf(cpf);
            gerente.setSenha(senha);
            DaoGerente daoGerente = new DaoGerente();
            // Teste para verificar se um Gerente com o Cpf e a Senha passados existe no banco de dados
            if(daoGerente.findByCpfSenhaGerente(gerente).isEmpty()) {
                // Caso não exista, então retorna que o funcionário com o tal Cpf e Senha não existe
                JOptionPane.showMessageDialog(null, FUNCIONARIO_NAO_EXISTE, "Erro", 1);
                throw new BusinessException(FUNCIONARIO_NAO_EXISTE);
            } else { 
                // Se um gerente existir com os mesmos Cpf e Senha, retorna um sinal em inteiro para a tela de Login
                return 2; 
            }
        } else {
            // Se um Caixa existir com os mesmos Cpf e Senha, retorna um sinal em inteiro para a tela de Login
            return 1;
        }
    }
}
