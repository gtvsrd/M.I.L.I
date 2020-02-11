package br.com.ifba.vp.caixa.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.caixa.dao.DaoCaixa;
import br.com.ifba.vp.caixa.dao.IDaoCaixa;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ServiceCaixa implements IServiceCaixa {
    
    private final IDaoCaixa daoCaixa = new DaoCaixa();
    
    @Override
    public Caixa saveCaixa(Caixa caixa) {
        return this.daoCaixa.save(caixa);
    }

    @Override
    public Caixa updateCaixa(Caixa caixa) {
        return this.daoCaixa.update(caixa);
    }

    @Override
    public void deleteCaixa(Caixa caixa) {
        this.daoCaixa.delete(caixa);
    }

    @Override
    public List<Caixa> findAllCaixa() {
        return this.daoCaixa.findAll();
    }

    @Override
    public Caixa findByIdCaixa(Long id) {
        return this.daoCaixa.findById(id);
    }
    
    @Override
    public Caixa findByCpfCaixa(String cpf) {
        return this.daoCaixa.findByCpfCaixa(cpf);
    }
    
}
