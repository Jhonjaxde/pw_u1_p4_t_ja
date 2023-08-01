package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	
	
	public Integer getId() {
		return 8;
	}

	
	public void acceptar(String arg) {
		String cadena="Augusto";
		LOG.info(cadena+""+arg);
	};
	
	public boolean contiene(String arg) {
		
		if (arg.contains("u")) {
			return true;
		} else {
			return false;
		}
		
	};
	
	//function
	
	public Integer aplica(String arg) {
		if(arg.length()<4) {
			return 1;
		}else {
			return 0;
		}
		
	};
	
	
   // unary operator
	//unary operator
	
		public Integer aplicarPeso(Integer arg) {
			Integer pesoPeligroso = arg +23;
			return pesoPeligroso;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public String juego(Integer arg) {
			if(arg.equals(7)) {
				return "ganador";
			}else {
				return "perdedor";
			}
			
		};
		
		
		
		
		
		
		public Double aplicarIva(Double arg) {
			Double precioIva = arg*1.12;
			return precioIva;
		}

	
	
}
