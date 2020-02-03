/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.caixa.service.ServiceCaixa;
import br.com.ifba.vp.caixa.service.IServiceCaixa;
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
    
    
    //------------------------ Login ------------------------//
    public void Login() {
        
    }
    
}
