/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.dao;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.infrastructure.dao.IGenericDao;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoCaixa extends IGenericDao<Caixa> {
    public abstract Caixa findByCpfCaixa(String cpf);
    public abstract List<Caixa> findByCpfSenhaCaixa(Caixa caixa);
}
