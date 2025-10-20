package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Estudiante;
import com.example.Parcial2Spring.entities.Profesor;
import com.example.Parcial2Spring.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProfesorService {
    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository){
        this.profesorRepository = profesorRepository;
    }

    public List<Profesor> findAll(){
        return profesorRepository.findAll();
    }

    public Profesor save(Profesor p) {
        return profesorRepository.save(p);
    }

    public Optional<Profesor> findById(Long id) {
        return profesorRepository.findById(id);
    }

}
