package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface IHotelRepository {

	public void insertar(Hotel hotel);

	public List<Hotel> seleccionarInnerJoin();

	public List<Hotel> seleccionarOuterRightJoin();

	public List<Hotel> seleccionarOuterLeftJoin();

	public List<Hotel> seleccionarOuterFullJoin();

	public List<Hotel> seleccionarWhereJoin();

	public List<Habitacion> seleccionarHabitacionesInnerJoin();

	public List<Habitacion> seleccionarHabitacionesOuterRightJoin();

	public List<Habitacion> seleccionarHabitacionesOuterLeftJoin();

	public List<Habitacion> seleccionarHabitacionesOuterFullJoin();

	public List<Habitacion> seleccionarHabitacionesWhereJoin();

}