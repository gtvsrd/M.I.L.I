/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IServiceCliente {
    public abstract Cliente saveCliente (Cliente cliente);
    public abstract Cliente updateCliente (Cliente cliente);
    public abstract void deleteCliente (Cliente cliente);
    public abstract List<Cliente> findAllCliente();
    public abstract Cliente findByIdCliente(Long id);
}
