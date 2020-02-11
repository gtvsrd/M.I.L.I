package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.login.service.ServiceLogin;
import br.com.ifba.vp.login.service.IServiceLogin;
import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.caixa.service.ServiceCaixa;
import br.com.ifba.vp.caixa.service.IServiceCaixa;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.cliente.service.IServiceCliente;
import br.com.ifba.vp.cliente.service.ServiceCliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.fornecedor.service.IServiceFornecedor;
import br.com.ifba.vp.fornecedor.service.ServiceFornecedor;
import br.com.ifba.vp.gerente.model.bean.Gerente;
import br.com.ifba.vp.gerente.service.IServiceGerente;
import br.com.ifba.vp.gerente.service.ServiceGerente;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.service.IServiceProduto;
import br.com.ifba.vp.produto.service.ServiceProduto;
import java.util.List;
/**
 *
 * @author gusta
 */
public class Facade implements IFacade {
    
    //------------------------ Funcionário ------------------------//
    
    private final IServiceCaixa serviceCaixa = new ServiceCaixa();
    
    @Override
    public Caixa saveCaixa(Caixa caixa) {
        return this.serviceCaixa.saveCaixa(caixa);
    }

    @Override
    public Caixa updateCaixa(Caixa caixa) {
        return this.serviceCaixa.updateCaixa(caixa);
    }

    @Override
    public void deleteCaixa(Caixa caixa) {
        this.serviceCaixa.deleteCaixa(caixa);
    }

    @Override
    public List<Caixa> findAllCaixa() {
        return this.serviceCaixa.findAllCaixa();
    }

    @Override
    public Caixa findByIdCaixa(Long id) {
        return this.serviceCaixa.findByIdCaixa(id);
    }
    
    @Override
    public Caixa findByCpfCaixa(String cpf) {
        return this.serviceCaixa.findByCpfCaixa(cpf);
    }
    
    //----------------------- Gerente -----------------------//
    
    private final IServiceGerente serviceGerente = new ServiceGerente();
    
    @Override
    public Gerente saveGerente(Gerente gerente) {
        return this.serviceGerente.saveGerente(gerente);
    }

    @Override
    public Gerente updateGerente(Gerente gerente) {
        return this.serviceGerente.updateGerente(gerente);
    }

    @Override
    public void deleteGerente(Gerente gerente) {
        this.serviceGerente.deleteGerente(gerente);
    }

    @Override
    public List<Gerente> findAllGerente() {
        return this.serviceGerente.findAllGerente();
    }

    @Override
    public Gerente findByIdGerente(Long id) {
        return this.serviceGerente.findByIdGerente(id);
    }
    
    
    //------------------------ Login ------------------------//

    private final IServiceLogin serviceLogin = new ServiceLogin();
    
    @Override
    public Integer Login(String cpf, Long senha) {
        return this.serviceLogin.Login(cpf, senha);
    }
    
    //------------------------ Cliente ------------------------//

    private final IServiceCliente serviceCliente = new ServiceCliente();
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
        return this.serviceCliente.saveCliente(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return this.serviceCliente.updateCliente(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        this.serviceCliente.deleteCliente(cliente);
    }

    @Override
    public List<Cliente> findAllCliente() {
        return this.serviceCliente.findAllCliente();
    }

    @Override
    public Cliente findByIdCliente(Long id) {
        return this.serviceCliente.findByIdCliente(id);
    }
    
    //------------------------ Produto ------------------------//
    
    private final IServiceProduto serviceProduto = new ServiceProduto();
    
    @Override
    public Produto saveProduto(Produto produto) {
        return this.serviceProduto.saveProduto(produto);
    }
    
    @Override
    public Produto updateProduto(Produto produto) {
        return this.serviceProduto.updateProduto(produto);
    }
    
    @Override
    public void deleteProduto(Produto produto) {
        this.serviceProduto.deleteProduto(produto);
    }
    
    @Override
    public List<Produto> findAllProduto() {
        return this.serviceProduto.findAllProduto();
    }
    
    @Override
    public Produto findByIdProduto(Long id) {
        return this.serviceProduto.findByIdProduto(id);
    }
    
    @Override
    public List<Produto> findByNomeProduto(String nome) {
        return this.serviceProduto.findByNomeProduto(nome);
    }
    
    @Override
    public Produto findByCodigoProduto(Long codigo) {
        return this.serviceProduto.findByCodigoProduto(codigo);
    }
    
    //----------------------- Fornecedor -----------------------//
    
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return this.serviceFornecedor.saveFornecedor(fornecedor);
    }
    
}
