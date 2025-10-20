package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Estudiante;
import com.example.Parcial2Spring.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EstudianteService {
    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> findById(Long id) {
        return estudianteRepository.findById(id);
    }

    public Estudiante save(Estudiante e) {
        return estudianteRepository.save(e);
    }
}
