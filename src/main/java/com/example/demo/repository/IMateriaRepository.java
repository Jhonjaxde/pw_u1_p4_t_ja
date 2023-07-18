package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public void insertar(Materia materia);
    public void actualizar(Materia materia);
    public void eliminar(Integer id);
    public Materia buscar(Integer id);

}