/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.caixa.view.TelaCaixa;
import br.com.ifba.vp.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ServiceCaixa implements IServiceCaixa {
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
    public Caixa saveCaixa(Caixa funcionarioCaixa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caixa updateCaixa(Caixa funcionarioCaixa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCaixa(Caixa funcionarioCaixa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Caixa> getAllCaixa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caixa getByIdCaixa(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
