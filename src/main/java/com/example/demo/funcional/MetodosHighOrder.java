package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {
	// reciben una implementacion de una interfaz funcional pero no especifican
	// dicha implementacion sino una interfaz
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public void metodo(IPersonaSupplier<String> funcion) {
		// recibe una interfaz pero realmente
		// recibe una implementacion
		funcion.getId();
		LOG.info("High Order Supplier: " + funcion.getId());
	};

	public void metodoConsumer(IPersonaConsumer<String> funcionConsumer, String cu) {

		funcionConsumer.accept(cu);
		// LOG.info("High Order Consumer: ");
	};
	
	
	public void metodoPredicate(IPersonaPredicate<String> funcionPredicate, String pre) {

		funcionPredicate.evaluar(pre);
		LOG.info("High Order predicate: " + funcionPredicate.evaluar(pre));
		// LOG.info("High Order Consumer: ");
	};
	public void metodoFunction(IPersonaFunction<String, Integer> function , Integer  a) {

		function.aplicar(a);
		LOG.info("High Order function: " + function.aplicar(a));
		// LOG.info("High Order Consumer: ");
	};
	public void metodoUO(IPersonaUnaryOperator<Integer> unaryOperator, Integer  a) {

		unaryOperator.aplicar(a);
		LOG.info("High Order Unary Operator: " + unaryOperator.aplicar(a));
		// LOG.info("High Order Consumer: ");
	};
}