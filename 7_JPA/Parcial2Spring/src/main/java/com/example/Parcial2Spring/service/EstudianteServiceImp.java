package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Estudiante;
import com.example.Parcial2Spring.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EstudianteServiceImp implements EstudianteService{
    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImp(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public Estudiante save(Estudiante e) {
        return estudianteRepository.save(e);
    }
}
