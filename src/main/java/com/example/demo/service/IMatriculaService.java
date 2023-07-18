package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaService {
    public void guardar(Matricula matricula);
    public void actualizar(Matricula matricula);
    public void borrar(Integer id);
    public Matricula buscar(Integer id);
    
    
    public List<Matricula> matricular();
    
}