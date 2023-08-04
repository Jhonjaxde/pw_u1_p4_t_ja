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

		// TAREA 16

		LOG.info("Primer ejemplo:");
		MetodosReferenciados metodosTarea = new MetodosReferenciados();

		// IPersonaSupplier<Integer> supplierT = metodosTarea::numerosDado;
		// LOG.info("Supplier metodo referenciado:" + supplierT.getId());
		Stream<Integer> listaNDados = Stream.generate(metodosTarea::numerosDado).filter(metodosTarea::compararMayor)
				.limit(6);
		listaNDados.forEach(metodosTarea::mensaje);
		// 2.- Consumer
		LOG.info("Segundo ejemplo:");
		List<String> listaAvengers = Arrays.asList("Spider-man", "Capitan America", "Black Widow", "Ant-man",
				"Iron-man");
		listaAvengers.replaceAll(metodosTarea::ranking);
		listaAvengers.forEach(metodosTarea::mensajeString);

		// 3.- Predicate
		LOG.info("Tercero ejemplo:");
		List<Integer> binarios = Arrays.asList(1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1);
		Stream<Integer> listaUno = binarios.stream().filter(metodosTarea::comparar);
		listaUno.forEach(metodosTarea::mensaje);

		// 4.- Function
		LOG.info("Cuarto ejemplo:");
		Stream<Integer> listaRanking = listaAvengers.stream().map(metodosTarea::man);
		listaRanking.forEach(metodosTarea::mensaje);

		// 5.- Unary Operator
		LOG.info("Quinto ejemplo:");
		List<Double> precios = Arrays.asList(12.7, 14.1, 10.95, 81.39, 180.59, 30.53, 230.23, 41.00, 16.54, 780.91,
				91.00);
		precios.replaceAll(metodosTarea::iva);
		precios.forEach(metodosTarea::mensajeDouble);

		// TAREA 17

		// metodos Hig Order
		LOG.info("TAREA17:");
		MetodosHighOrder highOrder = new MetodosHighOrder();

		// 1.- clase
		IPersonaSupplier<String> Supplier0 = new PersonaSupplierImpl();

		highOrder.metodo(Supplier0);
		// 2.- Lambda
		highOrder.metodo(() -> "1723456890");
		highOrder.metodo(() -> {
			String cedula = "1273648712";
			cedula = cedula + "ele";
			return cedula;
		});
		// es un metodo que recibe una implementacion de una interfaz funcional
		// 3.- Metodos referenciados
		highOrder.metodo(MetodosReferenciados::getIdHO);

		// consumer

		// 1.- clase
		IPersonaConsumer<String> consumidor = new PersonaConsumerImpl();
		// consumidor.accept("Jhon Arteaga");
		LOG.info("Consumer clases:");
		highOrder.metodoConsumer(consumidor, "en clase");
		// 2.- lambda
		LOG.info("Consumer lambda:");
		highOrder.metodoConsumer(cadena1 -> LOG.info(cadena1), "en lambda");

		// 3.- metodos referenciados
		LOG.info("Consumer metodos referenciados:");
		// consumidor.accept("iwi");
		highOrder.metodoConsumer(metodosTarea::acceptar1, "en metodos referenciados");
		// Predicate

		// 1.- clase
		LOG.info("predicate clase:");
		IPersonaPredicate<String> predicado = new PersonaPredicateImpl();

		highOrder.metodoPredicate(predicado, "aparentemente");

		// 2.- lambda
		LOG.info("predicate lambda:");
		highOrder.metodoPredicate(arg -> {

			if (arg.equals("buenos")) {
				return true;
			} else {
				return false;
			}
		}, "buenos");

		// 3.- metodos referenciados
		LOG.info("predicate metodos referenciados:");
		highOrder.metodoPredicate(metodosTarea::compararString, "ele");

		// Function

		// 1.- clase
		LOG.info("Function clase:");
		IPersonaFunction<String, Integer> function = new PersonaFunctionImpl();

		highOrder.metodoFunction(function, 1);

		// 2.- lambda
		LOG.info("Function lambda:");
		highOrder.metodoFunction(numero -> {
			String frase = numero + "hola";
			return frase;
		}, 1);

		// 3.- metodos referenciados
		LOG.info("function metodos referenciados:");
		highOrder.metodoFunction(metodosTarea::unir, 1);

		// Unary operator

		

		// 1.- clase
		LOG.info("Unary operator clase:");
		IPersonaUnaryOperator<Integer> unaryOperator = new PersonaUnaryOperatorImpl();

		highOrder.metodoUO(unaryOperator,10);
		
		// 2.- lambda
		LOG.info("Unary operator lambda:");
		highOrder.metodoUO(numero -> {
			Integer multi = numero*69;
			return  multi;
		}, 54);

		// 3.- metodos referenciados
		LOG.info("Unary operator metodos referenciados:");
		highOrder.metodoUO(metodosTarea::resta, 18);

	}

}