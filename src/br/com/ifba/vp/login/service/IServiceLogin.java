package br.com.ifba.vp.login.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;

/**
 *
 * @author gusta
 */
public interface IServiceLogin {
    public abstract Integer Login(String cpf, Long senha);
}
