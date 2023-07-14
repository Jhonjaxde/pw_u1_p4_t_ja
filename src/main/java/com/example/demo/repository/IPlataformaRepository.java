package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Plataforma;



public interface IPlataformaRepository {
	public List<Plataforma> seleccionarInnerJoin();

	public List<Plataforma> seleccionarOuterRightJoin();

	public List<Plataforma> seleccionarOuterLeftJoin();

	public List<Plataforma> seleccionarOuterFullJoin();

	public List<Plataforma> seleccionarWhereJoin();
}
