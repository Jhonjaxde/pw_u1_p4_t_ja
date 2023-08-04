package com.example.demo.funcional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
	
		
		
		
		
		
		//TAREA 17
		
			
		LOG.info("Primer ejemplo:");
		MetodosReferenciados metodosTarea = new MetodosReferenciados();
		
		//IPersonaSupplier<Integer> supplierT = metodosTarea::numerosDado;
		//LOG.info("Supplier metodo referenciado:" + supplierT.getId());
				Stream<Integer> listaNDados = Stream.generate(metodosTarea::numerosDado).filter(metodosTarea::compararMayor).limit(6);
				listaNDados.forEach(metodosTarea::mensaje);
				//2.- Consumer
				LOG.info("Segundo ejemplo:");
				List<String> listaAvengers = Arrays.asList("Spider-man","Capitan America","Black Widow","Ant-man","Iron-man");
				listaAvengers.replaceAll(metodosTarea::ranking);
				listaAvengers.forEach(metodosTarea::mensajeString);
		
		
				// 3.- Predicate 
				LOG.info("Tercero ejemplo:");
				List<Integer> binarios = Arrays.asList(1,1,0,1,0,0,0,1,1,0,1);
				Stream<Integer> listaUno=binarios.stream().filter(metodosTarea::comparar);
				listaUno.forEach(metodosTarea::mensaje);
		
		
				// 4.- Function
				LOG.info("Cuarto ejemplo:");
				Stream <Integer> listaRanking= listaAvengers.stream().map(metodosTarea::man);
				listaRanking.forEach(metodosTarea::mensaje);
				
		
				// 5.- Unary Operator
				LOG.info("Quinto ejemplo:");
				List<Double> precios = Arrays.asList(12.7,14.1,10.95,81.39,180.59,30.53,230.23,41.00,16.54,780.91,91.00);
				precios.replaceAll(metodosTarea::iva);
				precios.forEach(metodosTarea::mensajeDouble);
				
	}

}