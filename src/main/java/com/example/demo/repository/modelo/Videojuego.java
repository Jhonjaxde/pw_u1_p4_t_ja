package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "videojuego")
public class Videojuego {
	@GeneratedValue(generator = "seq_videojuego", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_videojuego", sequenceName = "seq_videojuego", allocationSize = 1)

	@Id
	@Column(name = "vdj_id")
	private Integer id;
	@Column(name = "vdj_nombre")
	private String nombre;
	@Column(name = "vdj_precio")
	private BigDecimal precio;
	@Column(name = "vdj_fechaLanzamiento")
	private LocalDateTime fechaLanzamiento;
	
	@ManyToMany
	
	@JoinTable(name = "plataforma_videojuego",joinColumns = @JoinColumn(name = "plavj_id_videojuego"),inverseJoinColumns =@JoinColumn( name = "plavj_id_plataforma"))
	
	private Set<Plataforma> plataformas;
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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDateTime getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Set<Plataforma> getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(Set<Plataforma> plataformas) {
		this.plataformas = plataformas;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fechaLanzamiento="
				+ fechaLanzamiento + ", plataformas=" + plataformas + "]";
	}
	
	

}
