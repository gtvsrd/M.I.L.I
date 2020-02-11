package br.com.ifba.vp.gerente.dao;

import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.infrastructure.dao.IGenericDao;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoGerente extends IGenericDao<Gerente>{
    //Função que retorna uma lista de Gerentes a partir do Cpf e Senha enviados; usado na tela de Login.
    public abstract List<Gerente> findByCpfSenhaGerente(Gerente gerente);
}
