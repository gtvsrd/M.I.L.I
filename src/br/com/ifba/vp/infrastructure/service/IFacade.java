/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IFacade {
    // Metodo que salva um Grupo de Pesquisa na base de dados
    public abstract Caixa saveCaixa (Caixa funcionarioCaixa);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract Caixa updateCaixa (Caixa funcionarioCaixa);
    // Metodo que deleta um Grupo de Pesquisa da base de dados
    public abstract void deleteCaixa (Caixa funcionarioCaixa);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<Caixa> getAllCaixa();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract Caixa getByIdCaixa(Long id);
}
