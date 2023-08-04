package com.example.demo.funcional;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	Random aleatorio = new Random();

	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);

	public static Integer getId() {
		return 8;
	};

	public void acceptar(String arg) {

		String cadena = "JUANITO";
		LOG.info(cadena + " " + arg);

	};

	public boolean evaluar(String arg) {
		return arg.equals("holi");

	};

	public static String getIdHO() {
		LOG.info("Metodos referenciados y HO: ");

		return "Jhon Arteaga";
	};

	public void acceptar1(String arg) {

		String cadena = "JUANITO";
		LOG.info(cadena + " " + arg);

	};

	// metodos de TAREA17
	// supplier
	public Integer numerosDado() {
		Integer[] numeros = { 1, 2, 3, 4, 5, 6 };
		return numeros[aleatorio.nextInt(1, 6)];
	};

	// predicate
	public boolean compararMayor(Integer numero) {
		return numero > 3;
	
	};
	public boolean compararString(String ele) {
		return ele.equals("ala");
		
	
	};
	public boolean comparar(Integer numero) {
		return numero ==1;	};
	//consumer
	public void mensaje(Integer arg) {
		LOG.info("" + arg);

	};
	public void mensajeString(String arg) {
		LOG.info("" + arg);

	};
	public void mensajeDouble(Double arg) {
		LOG.info("" + arg);

	};
	
	//function
	
	public Integer man(String arg) {
		if(arg.contains("man"))
		{
			return 1;
		}else {
		return 0;
		}
	}
	public String unir(Integer arg) {
		return arg + "sss";
		
		
	}
	
	//unary operator
	public String ranking(String arg) {
		
		return arg+" esta en el ranking: " + aleatorio.nextInt(1,10);
	};
	
public Double iva(Double arg) {
		
		return arg*1.12;
	};
	
public Integer resta(Integer arg) {
		
		return arg-aleatorio.nextInt(1,10);
	};
}