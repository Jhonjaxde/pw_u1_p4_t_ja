package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class PwU3P4TJaApplication implements CommandLineRunner {
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(PwU3P4TJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Hotel hot = new Hotel();
		 * 
		 * hot.
		 * setDireccion("101-0021 Prefectura de Tokio, Chiyoda-ku, Sotokanda 3-10-11, Japón"
		 * ); hot.setNombre("NOHGA HOTEL AKIHABARA TOKYO");
		 * 
		 * Habitacion habi = new Habitacion(); habi.setNumero("69"); habi.setValor(new
		 * BigDecimal(101)); habi.setHotel(hot); Habitacion habi1 = new Habitacion();
		 * habi1.setNumero("13"); habi1.setValor(new BigDecimal(43));
		 * habi1.setHotel(hot);
		 * 
		 * Habitacion habi2 = new Habitacion(); habi2.setNumero("16");
		 * habi2.setValor(new BigDecimal(46)); habi2.setHotel(hot);
		 * 
		 * List<Habitacion> habitaciones = new ArrayList<Habitacion>();
		 * 
		 * habitaciones.add(habi); //habitaciones.add(habi1); //habitaciones.add(habi2);
		 * 
		 * hot.setHabitaciones(habitaciones);
		 * 
		 * this.hotelService.guardar(hot);
		 */

		/*List<Hotel> listaHotel = this.hotelService.buscarWhereJoin();

		for (Hotel h : listaHotel) {
			if (h == null) {
				System.out.println("No existe este hotel aun");

			} else {
				System.out.println(h.getId() +" Direccion: "+ h.getDireccion()+" ,Nombre: "+h.getNombre());
			}
		}*/
		
	List<Habitacion> listahabiHabitaciones= this.hotelService.buscarHabitacionesInnerJoin();

		for (Habitacion ha : listahabiHabitaciones) {
			if (ha == null) {
				System.out.println("No existe esta habitacion aun");

			} else {
				System.out.println( ha.getValor());
			}
		}
	}

}
