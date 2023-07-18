package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {
	public void guardar(Materia materia);
    public void actualizar(Materia materia);
    public void borrar(Integer id);
    public Materia buscar(Integer id);
}