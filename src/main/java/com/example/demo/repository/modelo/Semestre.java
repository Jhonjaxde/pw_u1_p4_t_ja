package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name="semestre")
public class Semestre {
	
	@GeneratedValue(generator = "seq_semestre", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_semestre",sequenceName = "seq_semestre",allocationSize = 1)
	
	@Id
	@Column(name="sem_id")
	private Integer id;
	@Column(name="sem_fecha")
	private LocalDateTime fecha;
	@Column(name="sem_periodo")
	private String periodo;
	@Column(name="sem_costo")
	private BigDecimal costo;
	
	@OneToMany(mappedBy = "semestre")//onetomany no tiene join solo las secundarias
	private  List<Materia> materias;

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

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		return "Semestre [id=" + id + ", fecha=" + fecha + ", periodo=" + periodo + ", costo=" + costo + ", materias="
				+ materias + "]";
	}
	
	
	



}