package com.projeto.integrador.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.projeto.integrador.model.entities.UnidadeFederativa;
import com.projeto.integrador.repository.IUnidadeFederativaRepository;
import com.projeto.integrador.repository.impl.UnidadeFederativaRepository;

@ManagedBean
public class UnidadeFederativaBean {
	 @ManagedProperty(value="#{entityManager}")
	 private EntityManager entityManager;

//	 @Inject
//	 private IUnidadeFederativaRepository repository;
    
    private UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
    
    public UnidadeFederativaBean( ) {
 
    }
    
    public void save() {
        UnidadeFederativaRepository unidadeFederativaRepository = new UnidadeFederativaRepository( entityManager );
        unidadeFederativaRepository.salvar(this.unidadeFederativa);
        this.unidadeFederativa = new UnidadeFederativa();
    }
     
    public void remove(UnidadeFederativa unidadeFederativa) {
//    	UnidadeFederativaRepository repository = new UnidadeFederativaRepository(this.entityManager);
//        repository.excluir(unidadeFederativa);
    	
    }
     

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

//	public IUnidadeFederativaRepository getRepository() {
//		return repository;
//	}
//	public UnidadeFederativaRepository getUnidadeFederativaRepository() {
//		return unidadeFederativaRepository;
//	}  
	
	
	
    
}

