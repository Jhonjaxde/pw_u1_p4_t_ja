package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	
	@GeneratedValue(generator = "seq_matricula", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)

	@Id
	@Column(name = "mtla_id")
	private Integer id;
	@Column(name = "mtla_fecha")
	private LocalDateTime fecha;
	@Column(name = "mtla_numero")
	private String numero;
	
	@Column(name = "mtla_institucion")
	private String institucion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estudiante_id") 
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="materia_matricula",joinColumns = @JoinColumn(name= "matrimtla_id_matricula"),inverseJoinColumns = @JoinColumn(name="matrimtla_id_materia"))
	private Set<Materia> materias;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	
	public Set<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", numero=" + numero + ", institucion=" + institucion
				+ ", estudiante=" + estudiante + ", materia=" + materias + "]";
	}

	
	
	
	
	

}