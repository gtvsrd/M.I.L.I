/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.service;

import br.com.ifba.vp.gerente.model.bean.Gerente;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IServiceGerente {
    public abstract Gerente saveGerente(Gerente gerente);
    public abstract Gerente updateGerente(Gerente gerente);
    public abstract void deleteGerente(Gerente gerente);
    public abstract List<Gerente> findAllGerente();
    public abstract Gerente findByIdGerente(Long id);
    
}
