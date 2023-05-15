package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class PwU1P4TJaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PwU1P4TJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Este proyecto es de la tarea 3");
		Scanner n = new Scanner(System.in);
         System.out.print("Introduce numero: ");
         int numero = n.nextInt();
        if(numero > 1) {
       
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 
        int nf1=1;
        int nf2=1;
        System.out.println(nf1);
        for(int i=2;i<=numero;i++){
            System.out.println(nf2);
            
            nf2 = nf1 + nf2;
            nf1 = nf2 - nf1;
        }
        System.out.println();
		}else {
			System.out.println("Numero no valido");
		}
	}

}
