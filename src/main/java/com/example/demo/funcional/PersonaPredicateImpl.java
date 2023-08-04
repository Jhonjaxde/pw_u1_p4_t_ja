package com.example.demo.funcional;

public class PersonaPredicateImpl implements IPersonaPredicate<String> {

	@Override
	public boolean evaluar(String arg) {
		if(arg.contains("a")) {
			return true;
		}else {
			return false;
		}
		
	}

}
