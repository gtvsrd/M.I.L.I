/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IFacade {
    //------------------------ Caixa ------------------------//
    // Metodo que salva um Grupo de Pesquisa na base de dados
    public abstract Caixa saveCaixa(Caixa caixa);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract Caixa updateCaixa(Caixa caixa);
    // Metodo que deleta um Grupo de Pesquisa da base de dados
    public abstract void deleteCaixa(Caixa caixa);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<Caixa> findAllCaixa();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract Caixa findByIdCaixa(Long id);
    public abstract Caixa findByCpfCaixa(String cpf);
    
    //----------------------- Gerente -----------------------//
    
    public abstract Gerente saveGerente(Gerente gerente);
    public abstract Gerente updateGerente(Gerente gerente);
    public abstract void deleteGerente(Gerente gerente);
    public abstract List<Gerente> findAllGerente();
    public abstract Gerente findByIdGerente(Long id);
    
    //------------------------ Login ------------------------//
    
    public abstract Integer Login(String cpf, Long senha);
    
    //------------------------ Cliente ------------------------//
    
    public abstract Cliente saveCliente(Cliente cliente);
    public abstract Cliente updateCliente(Cliente cliente);
    public abstract void deleteCliente(Cliente cliente);
    public abstract List<Cliente> findAllCliente();
    public abstract Cliente findByIdCliente(Long id);
    
    //----------------------- Produto ---------------------//
    
    public abstract Produto saveProduto(Produto produto);
    public abstract Produto updateProduto(Produto produto);
    public abstract void deleteProduto(Produto produto);
    public abstract List<Produto> findAllProduto();
    public abstract Produto findByIdProduto(Long id);
    public abstract List<Produto> findByNomeProduto(String nome);
    public abstract Produto findByCodigoProduto(Long codigo);
    
    //----------------------- Fornecedor -----------------------//
    
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
}
