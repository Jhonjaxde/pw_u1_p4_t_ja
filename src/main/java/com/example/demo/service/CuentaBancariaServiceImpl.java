package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;

	@Override
	public CuentaBancaria buscar(Integer id) {
		
		return this.cuentaBancariaRepository.seleccionar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		
		this.cuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public List<CuentaBancaria> reporteCtaBancaria() {
		
		return this.cuentaBancariaRepository.seleccionarCtaBancaria();
	}
	
}