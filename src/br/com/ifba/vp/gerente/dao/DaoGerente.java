package br.com.ifba.vp.gerente.dao;

import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.infrastructure.dao.GenericDao;
import java.util.List;

/**
 *
 * @author gusta
 */
public class DaoGerente extends GenericDao<Gerente> implements IDaoGerente {

    @Override
    public List<Gerente> findByCpfSenhaGerente(Gerente gerente) {
        String query = "select gerente from Gerente gerente WHERE gerente.cpf = "+ gerente.getCpf() +" and senha = "+ gerente.getSenha() +" ";
        return GenericDao.entityManager.createQuery(query).getResultList();
    }
    
}
