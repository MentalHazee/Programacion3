package com.example.Parcial2Spring.service;

import com.example.Parcial2Spring.entities.Curso;
import java.util.*;

public interface CursoService {
    List<Curso> findAll();
    Optional<Curso> findById(Long id);
    Curso createCurso(String nombre, Long profesorId);
    Curso save(Curso curso);
    Curso assignEstudianteToCurso(Long courseId, Long studentId);
    Curso assignEstudiantes(Long cursoId, Set<Long> estudianteIds);
    List<Curso> findCursosByEstudianteId(Long estudianteId);
}
