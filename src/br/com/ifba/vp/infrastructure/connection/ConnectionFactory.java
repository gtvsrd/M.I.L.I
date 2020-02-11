package br.com.ifba.vp.infrastructure.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gusta
 */
public class ConnectionFactory {
    // Cria um EntityManagerFactory com o nome do persistence unit do persistence.xml
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mili");
    
    //Função que cria um EntityManager para estabelecer uma conexão com o banco de dados
    public EntityManager getConnection() {
        return emf.createEntityManager();
    }
}
