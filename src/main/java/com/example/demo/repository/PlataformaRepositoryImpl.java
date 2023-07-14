package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.repository.modelo.Plataforma;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Repository
@Transactional
public class PlataformaRepositoryImpl implements IPlataformaRepository{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<Plataforma> seleccionarInnerJoin() {
		TypedQuery<Plataforma> myQuery =
                this.entityManager.createQuery("SELECT pla from Plataforma pla INNER JOIN pla.videjuegos vi",Plataforma.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Plataforma> seleccionarOuterRightJoin() {
		TypedQuery<Plataforma> myQuery =
                this.entityManager.createQuery("SELECT pla from Plataforma pla RIGHT JOIN pla.videjuegos vi",Plataforma.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Plataforma> seleccionarOuterLeftJoin() {
		TypedQuery<Plataforma> myQuery =
                this.entityManager.createQuery("SELECT pla from Plataforma pla LEFT JOIN pla.videjuegos vi",Plataforma.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Plataforma> seleccionarOuterFullJoin() {
		TypedQuery<Plataforma> myQuery =
                this.entityManager.createQuery("SELECT pla from Plataforma pla FULL JOIN pla.videjuegos vi",Plataforma.class);
        return myQuery.getResultList();
	}

	@Override
	public List<Plataforma> seleccionarWhereJoin() {
		TypedQuery<Plataforma> myQuery =
                this.entityManager.createQuery("SELECT pla FROM Plataforma pla, Videojuego vi WHERE pla=vi.plataforma",Plataforma.class);
        return myQuery.getResultList();
	}

}
