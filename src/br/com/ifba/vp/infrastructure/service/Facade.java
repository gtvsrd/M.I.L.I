/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.caixa.service.ServiceCaixa;
import br.com.ifba.vp.caixa.service.IServiceCaixa;
import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.gerente.service.IServiceGerente;
import br.com.ifba.vp.gerente.service.ServiceGerente;
import java.util.List;
/**
 *
 * @author gusta
 */
public class Facade implements IFacade {
    //------------------------ Funcionário ------------------------//
    
    private final IServiceCaixa serviceCaixa = new ServiceCaixa();
    
    @Override
    public Caixa saveCaixa(Caixa caixa) {
        return this.serviceCaixa.saveCaixa(caixa);
    }

    @Override
    public Caixa updateCaixa(Caixa caixa) {
        return this.serviceCaixa.updateCaixa(caixa);
    }

    @Override
    public void deleteCaixa(Caixa caixa) {
        this.serviceCaixa.deleteCaixa(caixa);
    }

    @Override
    public List<Caixa> getAllCaixa() {
        return this.serviceCaixa.getAllCaixa();
    }

    @Override
    public Caixa getByIdCaixa(Long id) {
        return this.serviceCaixa.getByIdCaixa(id);
    }
    
    //----------------------- Gerente -----------------------//
    
    private final IServiceGerente serviceGerente = new ServiceGerente();
    
    @Override
    public Gerente saveGerente(Gerente gerente) {
        return this.serviceGerente.saveGerente(gerente);
    }

    @Override
    public Gerente updateGerente(Gerente gerente) {
        return this.serviceGerente.updateGerente(gerente);
    }

    @Override
    public void deleteGerente(Gerente gerente) {
        this.serviceGerente.deleteGerente(gerente);
    }

    @Override
    public List<Gerente> getAllGerente() {
        return this.serviceGerente.getAllGerente();
    }

    @Override
    public Gerente getByIdGerente(Long id) {
        return this.serviceGerente.getByIdGerente(id);
    }
    
    
    //------------------------ Login ------------------------//
    private final IServiceLogin serviceLogin = new ServiceLogin();
    
    @Override
    public void Login(Long id, Long senha) {
        this.serviceLogin.Login(id, senha);
    }


    
}
