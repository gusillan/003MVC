package com.pacoillan;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
public class EntidadRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Entidad> buscarTodas(){
		
		TypedQuery<Entidad> consultaJPA = em.createQuery("select e from Entidad e",Entidad.class);
		return consultaJPA.getResultList();			
		
	}

@Transactional	
public void insertar(Entidad entidad) {
	em.persist(entidad);
}

@Transactional
public void borrar(Entidad entidad) {
	em.remove(em.merge(entidad));
}


	
}
