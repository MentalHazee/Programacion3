package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Curso;
import com.example.Parcial2Spring.entities.Profesor;
import com.example.Parcial2Spring.entities.Estudiante;
import com.example.Parcial2Spring.repository.CursoRepository;
import com.example.Parcial2Spring.repository.ProfesorRepository;
import com.example.Parcial2Spring.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class CursoService {
    private final CursoRepository cursoRepository;
    private final ProfesorRepository profesorRepository;
    private final EstudianteRepository estudianteRepository;

    public CursoService(CursoRepository cursoRepository, ProfesorRepository profesorRepository, EstudianteRepository estudianteRepository) {
        this.cursoRepository = cursoRepository;
        this.profesorRepository = profesorRepository;
        this.estudianteRepository = estudianteRepository;
    }

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> findById(Long id){
        return cursoRepository.findById(id);
    }

    public Curso createCurso(String nombre, Long profesorId){
        Profesor prof = profesorRepository.findById(profesorId)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
        Curso c = Curso.builder()
                .nombre(nombre)
                .profesor(prof)
                .estudiantes(new HashSet<>())
                .build();
        return  cursoRepository.save(c);
    }

    public Curso assignEstudiantes(Long cursoId, Set<Long> estudianteIds){
        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        Set<Estudiante> estudiantes = new HashSet<>();
        for (Long eid : estudianteIds) {
            Estudiante e = estudianteRepository.findById(eid)
                    .orElseThrow(() -> new RuntimeException("Estudiante no encontrado: " + eid));
            estudiantes.add(e);
        }

        curso.getEstudiantes().addAll(estudiantes);
        return cursoRepository.save(curso);
    }

    public List<Curso> findCursosByEstudianteId(Long estudianteId){
        return cursoRepository.findByEstudiantesId(estudianteId);
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }
}
