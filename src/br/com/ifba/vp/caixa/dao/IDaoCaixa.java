package br.com.ifba.vp.caixa.dao;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.infrastructure.dao.IGenericDao;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoCaixa extends IGenericDao<Caixa> {
    //Função que retorna um funcionário Caixa a partir do Cpf enviado; usado na tela de pesquisa de funcionário.
    public abstract Caixa findByCpfCaixa(String cpf);
    //Função que retorna uma lista de Caixas a partir do Cpf e Senha enviados; usado na tela de Login.
    public abstract List<Caixa> findByCpfSenhaCaixa(Caixa caixa);
}
