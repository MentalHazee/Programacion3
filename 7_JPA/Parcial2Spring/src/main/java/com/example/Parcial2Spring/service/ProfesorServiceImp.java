package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Profesor;
import com.example.Parcial2Spring.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProfesorServiceImp implements ProfesorService {
    private final ProfesorRepository profesorRepository;

    public ProfesorServiceImp(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor save(Profesor p) {
        return profesorRepository.save(p);
    }

}
