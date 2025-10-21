package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Estudiante;
import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    List<Estudiante> findAll();
    Optional<Estudiante> findById(Long id);
    Estudiante save(Estudiante e);
}
