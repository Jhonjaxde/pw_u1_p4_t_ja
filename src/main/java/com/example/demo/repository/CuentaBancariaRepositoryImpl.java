package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CuentaBancaria seleccionar(Integer id) {

		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {

		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public List<CuentaBancaria> seleccionarCtaBancaria() {
		TypedQuery<CuentaBancaria> myQuery = this.entityManager.createQuery(
				"SELECT cta FROM CuentaBancaria cta INNER JOIN cta.transferencia tra", CuentaBancaria.class);

		return myQuery.getResultList();
	}

}