package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface IHotelService {
	
	public void guardar(Hotel hotel);

	public List<Hotel> buscarInnerJoin();

	public List<Hotel> buscarOuterRightJoin();

	public List<Hotel> buscarOuterLeftJoin();
	
	public List<Hotel> buscarOuterFullJoin();

	public List<Hotel> buscarWhereJoin();
	
	public List<Habitacion> buscarHabitacionesInnerJoin();

	public List<Habitacion> buscarHabitacionesOuterRightJoin();

	public List<Habitacion> buscarHabitacionesOuterLeftJoin();
	
	public List<Habitacion> buscarHabitacionesOuterFullJoin();

	public List<Habitacion> buscarHabitacionesWhereJoin();
	
	


}