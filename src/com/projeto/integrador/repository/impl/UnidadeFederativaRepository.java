package com.projeto.integrador.repository.impl;


import javax.persistence.EntityManager;

import com.projeto.integrador.model.entities.UnidadeFederativa;
import com.projeto.integrador.repository.IUnidadeFederativaRepository;

@SuppressWarnings("serial")
public class UnidadeFederativaRepository  extends EntitiesRepository<UnidadeFederativa> implements IUnidadeFederativaRepository {
    	
	    public UnidadeFederativaRepository(EntityManager entity) {
	        entityManager = entity;
	    } 

}
