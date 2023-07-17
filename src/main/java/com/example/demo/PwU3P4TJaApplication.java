package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class PwU3P4TJaApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;

	public static void main(String[] args) {
		SpringApplication.run(PwU3P4TJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// creacion de propietarios
		Propietario p = new Propietario();
		p.setNombre("Emiliano");
		p.setApellido("Chispe");
		p.setCedula("1713175071");

		Propietario p1 = new Propietario();
		p1.setNombre("Maria Jose");
		p1.setApellido("Ontamilano");
		p1.setCedula("1713832071");

		Propietario p2 = new Propietario();
		p2.setNombre("Marcelo");
		p2.setApellido("Gozo");
		p2.setCedula("17324567765");

		// creacion de cuentas bancarias
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero("98432");
		cta.setSaldo(new BigDecimal(338));
		cta.setTipo("A");
		cta.setPropietario(p2);

		CuentaBancaria cta1 = new CuentaBancaria();
		cta1.setNumero("16257");
		cta1.setSaldo(new BigDecimal(11298));
		cta1.setTipo("C");
		cta1.setPropietario(p1);

		CuentaBancaria cta2 = new CuentaBancaria();
		cta2.setNumero("09253");
		cta2.setSaldo(new BigDecimal(869));
		cta2.setTipo("A");
		cta2.setPropietario(p2);

		// Agregamos a que tipo de cuenta es
		List<CuentaBancaria> listaCuentaAhorros = new ArrayList<>();
		List<CuentaBancaria> listaCuentaCorriente = new ArrayList<>();
		listaCuentaAhorros.add(cta);
		listaCuentaAhorros.add(cta2);
		
		listaCuentaCorriente.add(cta1);
		p1.setCuentaBancaria(listaCuentaCorriente);
		p2.setCuentaBancaria(listaCuentaAhorros);
		//Guardamos las cuentas bancarias
		//this.propietarioService.guardar(p1);
		//this.propietarioService.guardar(p2);

		//this.transferenciaService.guardarTransferencia(5, 7, new BigDecimal(130));
		//System.out.println(this.cuentaBancariaService.buscar(5).getSaldo());

		
		  List<Transferencia> transferencia =this.transferenciaService.reporteCta();
		  
		  for (Transferencia t :transferencia) { System.out.println(
		  "\nTransferencia ID: "+t.getId() +" \nMonton:"+t.getMonton()
		  +" \nFecha: "+t.getFecha() );
		  
		  }
		 

	}

}
