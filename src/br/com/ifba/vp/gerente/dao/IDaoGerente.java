/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.dao;

import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.infrastructure.dao.IGenericDao;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoGerente extends IGenericDao<Gerente>{
    public abstract List<Gerente> findByCpfSenhaGerente(Gerente gerente);
}
