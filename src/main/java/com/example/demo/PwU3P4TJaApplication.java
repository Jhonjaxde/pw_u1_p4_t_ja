package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Provincia;
import com.example.demo.repository.modelo.Semestre;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IMateriaService;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class PwU3P4TJaApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMatriculaService matriculaService;
	@Autowired
	private IMateriaService materiaService;

	public static void main(String[] args) {
		SpringApplication.run(PwU3P4TJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// creacion de provincias

		Provincia pro = new Provincia();
		pro.setNombre("manabi");
		pro.setCanton("Portoviejo");
		pro.setNumeroProvincia("13");

		// creacion de estudiante

		Estudiante estu = new Estudiante();
		estu.setCedula("1723456890");
		estu.setNombre("Emiliano");
		estu.setTelefono("0987654321");
		List<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(estu);

		// creacion de semestre

		Semestre se = new Semestre();
		se.setFecha(LocalDateTime.now());
		se.setCosto(new BigDecimal(302));
		se.setPeriodo("2023");

		// creacion de materia

		Materia ma = new Materia();
		ma.setCodigo("178");
		ma.setNombre("programacion");
		ma.setCurso("R8");

		List<Materia> listaMaterias = new ArrayList<>();
		listaMaterias.add(ma);
		
		Set<Materia> listaMaterias2 = new HashSet<>();
		listaMaterias2.add(ma);
		// creacion de matricula

		Matricula matri = new Matricula();
		matri.setFecha(LocalDateTime.now());
		matri.setInstitucion("COTAESG");
		matri.setNumero("8796");
		
		List<Matricula> listaMatricula = new ArrayList<>();
		listaMatricula.add(matri);
		
		Set<Matricula> listMatriculas2 = new HashSet<>();
		listMatriculas2.add(matri);
		
		// union de tablas
		pro.setEstudiantes(listaEstudiantes);
		estu.setProvincia(pro);
		
		se.setMaterias(listaMaterias);
		ma.setSemestre(se);
		
		estu.setMatriculas(listaMatricula);
		matri.setEstudiante(estu);
		
		ma.setMatriculas(listMatriculas2);
		matri.setMaterias(listaMaterias2);
		
		//ma.setMatriculas(listaMatricula);
		//matri.setMateria(ma);
		
		//this.matriculaService.guardar(matri);

		/*
		 * List<Hotel> listaHotel = this.hotelService.buscarWhereJoin(); for (Hotel h :
		 * listaHotel) { if (h == null) {
		 * System.out.println("No existe este hotel aun"); } else {
		 * System.out.println(h.getId() +" Direccion: "+
		 * h.getDireccion()+" ,Nombre: "+h.getNombre()); } }
		 */

	}

}
