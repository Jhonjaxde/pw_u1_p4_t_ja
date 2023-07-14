package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepository;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public List<Hotel> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Hotel> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<Hotel> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionesOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarHabitacionesOuterLeftJoin();
	}

	@Override
	public List<Hotel> buscarOuterFullJoin() {
		
		return this.hotelRepository.seleccionarOuterFullJoin();
	}

	@Override
	public List<Hotel> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarWhereJoin();
	}

	@Override
	public void guardar(Hotel hotel) {
		this.hotelRepository.insertar(hotel);
		
	}

	@Override
	public List<Habitacion> buscarHabitacionesInnerJoin() {
		
		return this.hotelRepository.seleccionarHabitacionesInnerJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionesOuterRightJoin() {
		
		return this.hotelRepository.seleccionarHabitacionesOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionesOuterFullJoin() {
		
		return this.hotelRepository.seleccionarHabitacionesOuterFullJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionesWhereJoin() {
		
		return this.hotelRepository.seleccionarHabitacionesWhereJoin();
	}

}