package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Plataforma;



public interface IPlataformaService {
	
	public List<Plataforma> buscarInnerJoin();

	public List<Plataforma> buscarOuterRightJoin();

	public List<Plataforma> buscarOuterLeftJoin();
	
	public List<Plataforma> buscarOuterFullJoin();

	public List<Plataforma> buscarWhereJoin();

}
