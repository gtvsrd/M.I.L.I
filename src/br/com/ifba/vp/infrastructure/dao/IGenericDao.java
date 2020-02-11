package br.com.ifba.vp.infrastructure.dao;

import br.com.ifba.vp.infrastructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IGenericDao <Entity extends AbstractEntity> {
        
    /**
     * Salva uma instância de uma entidade persistente no banco de dados.
     * 
     * @param obj a instância que é inserida
     * @return a entidade
     */
    Entity save(Entity obj);

    /**
     * Update an instance of the persistent entity in the system database.
     * 
     * @param obj the instance that is updated
     * @return the entity
     */
    Entity update(Entity obj);

    /**
     * Remove an instance of the persistent entity in the system database.
     * 
     * @param obj the instance that is updated
     */
    void delete(Entity obj);

    /**
     * Retrieve all instances of the entity in the database.
     * 
     * @return a {@link List} with the results.
     */
    List<Entity> findAll();
    
    /**
     * Find an entity by primary key.
     * 
     * @param id
     * @return the entity.
     */
    Entity findById(Long id);
}
