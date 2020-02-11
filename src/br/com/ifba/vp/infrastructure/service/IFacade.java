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

    // Metodo que salva um Caixa na base de dados
    public abstract Caixa saveCaixa(Caixa caixa);
    // Metodo que atualiza um Caixa que já existe na base de dados
    public abstract Caixa updateCaixa(Caixa caixa);
    // Metodo que deleta um Caixa da base de dados
    public abstract void deleteCaixa(Caixa caixa);
    // Metodo que retorna todos os Caixas da base de dados
    public abstract List<Caixa> findAllCaixa();
    // Método que retorna um Caixa pelo Id
    public abstract Caixa findByIdCaixa(Long id);
    // Método que retorna um Caixa pelo Cpf
    public abstract Caixa findByCpfCaixa(String cpf);
    
    //----------------------- Gerente -----------------------//
    
    // Metodo que salva um Gerente na base de dados
    public abstract Gerente saveGerente(Gerente gerente);
    // Metodo que atualiza um Gerente que já existe na base de dados
    public abstract Gerente updateGerente(Gerente gerente);
    // Metodo que deleta um Gerente da base de dados
    public abstract void deleteGerente(Gerente gerente);
    // Metodo que retorna todos os Gerentes da base de dados
    public abstract List<Gerente> findAllGerente();
    // Método que retorna um Gerente pelo Id
    public abstract Gerente findByIdGerente(Long id);
    
    //------------------------ Login ------------------------//
    
    //Método que busca um Caixa ou Gerente pelo Cpf e Senha
    public abstract Integer Login(String cpf, Long senha);
    
    //------------------------ Cliente ------------------------//
    
    // Metodo que salva um Cliente na base de dados
    public abstract Cliente saveCliente(Cliente cliente);
    // Metodo que atualiza um Cliente que já existe na base de dados
    public abstract Cliente updateCliente(Cliente cliente);
    // Metodo que deleta um Cliente da base de dados
    public abstract void deleteCliente(Cliente cliente);
    // Metodo que retorna todos os Clientes da base de dados
    public abstract List<Cliente> findAllCliente();
    // Método que retorna um Cliente pelo Id
    public abstract Cliente findByIdCliente(Long id);
    
    //----------------------- Produto ---------------------//
    
    // Metodo que salva um Produto na base de dados
    public abstract Produto saveProduto(Produto produto);
    // Metodo que atualiza um Produto que já existe na base de dados
    public abstract Produto updateProduto(Produto produto);
    // Metodo que deleta um Produto da base de dados
    public abstract void deleteProduto(Produto produto);
    // Metodo que retorna todos os Produtos da base de dados
    public abstract List<Produto> findAllProduto();
    // Método que retorna um Produto pelo Id
    public abstract Produto findByIdProduto(Long id);
    // Método que retorna um Produto pelo Nome
    public abstract List<Produto> findByNomeProduto(String nome);
    // Método que retorna um Produto pelo Código de Barras
    public abstract Produto findByCodigoProduto(Long codigo);
    
    //----------------------- Fornecedor -----------------------//
    
    // Metodo que salva um Fornecedor na base de dados
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
}
