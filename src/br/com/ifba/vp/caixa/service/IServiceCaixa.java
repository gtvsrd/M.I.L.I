/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IServiceCaixa {
    public abstract Caixa saveCaixa (Caixa caixa);
    public abstract Caixa updateCaixa (Caixa caixa);
    public abstract void deleteCaixa (Caixa caixa);
    public abstract List<Caixa> findAllCaixa();
    public abstract Caixa findByIdCaixa(Long id);
    public abstract Caixa findByCpfCaixa(String cpf);
}
