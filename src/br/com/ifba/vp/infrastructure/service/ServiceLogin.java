/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.caixa.service.ServiceCaixa;
import br.com.ifba.vp.caixa.view.TelaCaixa;
import br.com.ifba.vp.infrastructure.exception.BusinessException;

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
    public TelaCaixa loginFuncionarioCaixa(Caixa funcionarioCaixa) {
        if(funcionarioCaixa == null) {
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        if(funcionarioCaixa.getId() == null) {
            throw new BusinessException(CPF_NULL);
        }
        if(funcionarioCaixa.getSenha() == null) {
            throw new BusinessException(SENHA_NULL);
        }
        
        ServiceCaixa sfc = new ServiceCaixa();
        if(sfc.getByIdFuncionarioCaixa(funcionarioCaixa.getId()) == null){
            throw new BusinessException(FUNCIONARIO_NAO_EXISTE);
        }
        if(funcionarioCaixa.getId() == 76815194960 && funcionarioCaixa.getSenha() == 511671) {
            
        }
        
        TelaCaixa telaFuncionarioCaixa = new TelaCaixa();
        
        return telaFuncionarioCaixa.setVisible(true);
    }
}
