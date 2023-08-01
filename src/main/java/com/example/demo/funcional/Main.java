package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPersona per= new PersonaImpl();
		per.caminar();
		
		//1.supplier
		//clases:
		IPersonaSupplier<String> supplier= new PersonaSupplierImpl();
		LOG.info( "Supplier clase:" + supplier.getId() );
		
		//lAMBDAS
		//() no recibe nada mi lambda
		IPersonaSupplier<String> supplier2 = ()->  "71322354";
		LOG.info( "Supplier lambda:" + supplier2.getId() );
		
		IPersonaSupplier<String> supplier3 = ()-> {
			String cedula ="71322354";
			cedula = cedula +"78";
			return cedula;
		};
		LOG.info( "Supplier lambda:" + supplier3.getId() );
		
		
		//Metodos Referenciados
		System.out.println("metodos referenciados");
		MetodosReferenciados metodos= new MetodosReferenciados();
		IPersonaSupplier<Integer> supplier4=metodos::getId;
		LOG.info("Supplier metodo referenciado : "+supplier4.getId());
		
	    //2.- Consumer
        //clases:

        IPersonaConsumer<String> consumer1 =  new PersonaConsumerImpl();
        LOG.info("Consumer clase:" );
        consumer1.accept("Augusto Salazar");
		
		//Lambdas 
		IPersonaConsumer<String> consumer2 = cadena -> LOG.info(cadena);
		LOG.info("Consumer lambda");
		consumer2.accept("Augusto Salazar");
		
		//Metodos Referenciados
		System.out.println("metodos referenciados");
		
		IPersonaConsumer<String> consumer3=metodos::acceptar;
		LOG.info("Consumer metodo referenciado : ");
		consumer3.accept("Augusto Salazar3");

		
		//3.Predicate
		IPersonaPredicate<Integer> predicate1= valor -> valor.compareTo(8)==0;//nombre ->
		LOG.info("Predicate lambda:" + predicate1.evaluar(4));
		//forma 2
		IPersonaPredicate<Integer> predicate2= valor -> {
					Integer valor2=10;
					valor= valor+valor2;
					if (valor.compareTo(100)>0) {
						return true;
						
					}else {
						return false;
					}
					
				};
		LOG.info("Predicate lambda:" + predicate2.evaluar(95));

		IPersonaPredicate<String> predicate3= nombre ->{ String nombreinf="Augusto";
		
		if (nombreinf.contains(nombre)) {
			return true;
		} else {
			return false;
		}
		};

		LOG.info("Predicate lambda:" + predicate3.evaluar("u"));

		System.out.println("forma corta de comparar");
		IPersonaPredicate<String> predicate4=letra -> "Augusto".contains(letra);
		LOG.info("Predicate lambda: "+predicate4.evaluar("u"));

		IPersonaBiPredicate<String, String> predicate5=(letra,cadena) -> cadena.contains(letra);
		LOG.info("Predicate lambda5:"+ predicate5.evaluar("o", "Augusto"));
		
		//Metodos Referenciados
				System.out.println("metodos referenciados");
		IPersonaPredicate<String> predicate6=metodos::contiene;
		LOG.info("Predicate met referencias:"+predicate6.evaluar("augusto"));
		
		
		
		

		
		//function casteo 
		IPersonaFunction<String,Integer> function =
				numero -> numero.toString();
				LOG.info("Function lambda: "+ function.aplicar(8));
				
		IPersonaFunction<String,Integer> function1 =
				numero -> {
					String valorFinal= numero.toString().concat("valor");
					return valorFinal;
				};
			LOG.info("Function lambda: "+ function1.aplicar(10));	
			
			//Metodos Referenciados
			System.out.println("metodos referenciados function");
			IPersonaFunction <Integer,String> function2=metodos::aplica;
			LOG.info("Function meth referencia: "+ function2.aplicar("Augusto"));	
			
	
			
			
			
		
			//5. UnaryOperator		
			
			IPersonaUnaryOperator<Integer> unary= numero -> numero +(numero *2);
			LOG.info("Unary lambda: "+ unary.aplicar(3));	
			
			IPersonaUnaryOperatorFunction<Integer> unary2= numero -> numero +(numero *2);
			LOG.info("UnaryOperatorFunction lambda: "+ unary2.aplicar(3));
			
			//Metodos Referenciados
			System.out.println("metodos referenciados unaryOperator ");
			IPersonaUnaryOperator <Integer> unary3 = metodos::aplicarPeso;
			LOG.info("UnaryOperatorFunction metodo referenciado: "+ unary3.aplicar(70));
			
			

			
			
	}

}



























