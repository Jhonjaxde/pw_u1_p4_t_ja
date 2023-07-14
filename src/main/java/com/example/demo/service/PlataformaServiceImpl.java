package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPlataformaRepository;
import com.example.demo.repository.modelo.Plataforma;
@Service
public class PlataformaServiceImpl implements IPlataformaService{
	
	@Autowired
	private IPlataformaRepository plataformaRepository;
	
	@Override
	public List<Plataforma> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.plataformaRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Plataforma> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.plataformaRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<Plataforma> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.plataformaRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Plataforma> buscarOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.plataformaRepository.seleccionarOuterFullJoin();
	}

	@Override
	public List<Plataforma> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.plataformaRepository.seleccionarWhereJoin();
	}

}
