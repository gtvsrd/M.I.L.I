/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;

/**
 *
 * @author gusta
 */
public interface IServiceLogin {
    public abstract void Login(Long id, Long senha);
}
