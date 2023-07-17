package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.ITransferenciaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository transferenciaRepository;

	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;

	@Override
	public void guardarTransferencia(Integer ctaIdOrigen, Integer ctaIdDestino, BigDecimal monto) {
		

		CuentaBancaria ctaOrigen = this.cuentaBancariaRepository.seleccionar(ctaIdOrigen);
		BigDecimal saldoOrigen = ctaOrigen.getSaldo();

		BigDecimal montoDebitar = monto;

		if (montoDebitar.compareTo(saldoOrigen) <= 0) {
			BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(montoDebitar);
			ctaOrigen.setSaldo(nuevoSaldoOrigen);
			this.cuentaBancariaRepository.actualizar(ctaOrigen);

			CuentaBancaria ctaDestino = this.cuentaBancariaRepository.seleccionar(ctaIdDestino);
			BigDecimal saldoDestino = ctaDestino.getSaldo();
			BigDecimal nuevoSaldoDestino = saldoDestino.add(montoDebitar);
			ctaDestino.setSaldo(nuevoSaldoDestino);
			this.cuentaBancariaRepository.actualizar(ctaDestino);

			Transferencia tra = new Transferencia();
			tra.setCtaOrigen(ctaOrigen);
			tra.setCtaDestino(ctaDestino);
			tra.setMonton(monto);
			tra.setFecha(LocalDateTime.now());
			this.transferenciaRepository.insertar(tra);
			;

		} else {

			System.out.println("No se puede hacer la tranferencia debido al monto insuficiente ");
		}

	}

	@Override
	public void guardar(Transferencia transferencia) {
		
		this.transferenciaRepository.insertar(transferencia);

	}

	@Override
	public List<Transferencia> reporteCta() {
		
		return this.transferenciaRepository.seleccionarCta();
	}

}