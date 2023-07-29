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


		
		
		
	
	}

}
