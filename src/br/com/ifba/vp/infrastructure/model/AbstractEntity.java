package br.com.ifba.vp.infrastructure.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author gusta
 */

@MappedSuperclass
public class AbstractEntity {
    @Id @GeneratedValue
    private Long id;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
