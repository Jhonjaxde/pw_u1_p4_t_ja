package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataforma")
public class Plataforma {
	@GeneratedValue(generator = "seq_plataforma",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_plataforma",sequenceName = "seq_plataforma",allocationSize = 1)
	@Id
	@Column(name="plat_id")
	private Integer id;
	@Column(name="plat_nombre")
	private String nombre;
	@Column(name="plat_fechalanzamiento")
	private LocalDateTime fechalanzamiento;
	@Column(name="plat_generacion")
	private String generacion;
	
	@ManyToMany(mappedBy = "plataformas",cascade = CascadeType.ALL)
	private Set<Videojuego> videojuegos;
	
	//SET AND GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechalanzamiento() {
		return fechalanzamiento;
	}

	public void setFechalanzamiento(LocalDateTime fechalanzamiento) {
		this.fechalanzamiento = fechalanzamiento;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public Set<Videojuego> getVideojuegos() {
		return videojuegos;
	}

	public void setVideojuegos(Set<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
	}

	@Override
	public String toString() {
		return "Plataforma [id=" + id + ", nombre=" + nombre + ", fechalanzamiento=" + fechalanzamiento
				+ ", generacion=" + generacion + ", videojuegos=" + videojuegos + "]";
	}
	
	
	

}
