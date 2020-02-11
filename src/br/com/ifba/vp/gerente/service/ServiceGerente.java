package br.com.ifba.vp.gerente.service;

import br.com.ifba.vp.gerente.dao.DaoGerente;
import br.com.ifba.vp.gerente.dao.IDaoGerente;
import br.com.ifba.vp.gerente.model.bean.Gerente;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ServiceGerente implements IServiceGerente {

    private final IDaoGerente daoGerente = new DaoGerente();
    
    @Override
    public Gerente saveGerente(Gerente gerente) {
        return this.daoGerente.save(gerente);
    }

    @Override
    public Gerente updateGerente(Gerente gerente) {
        return this.daoGerente.update(gerente);
    }

    @Override
    public void deleteGerente(Gerente gerente) {
        this.daoGerente.delete(gerente);
    }

    @Override
    public List<Gerente> findAllGerente() {
        return this.daoGerente.findAll();
    }

    @Override
    public Gerente findByIdGerente(Long id) {
        return this.daoGerente.findById(id);
    }
    
}
