/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.dao.DaoCliente;
import br.com.ifba.vp.cliente.dao.IDaoCliente;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ServiceCliente implements IServiceCliente {
    
    private final IDaoCliente daoCliente = new DaoCliente();
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
        return this.daoCliente.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return this.daoCliente.update(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        this.daoCliente.delete(cliente);
    }

    @Override
    public List<Cliente> findAllCliente() {
        return this.daoCliente.findAll();
    }

    @Override
    public Cliente findByIdCliente(Long id) {
        return this.daoCliente.findById(id);
    }
    
}
