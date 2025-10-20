package com.example.Parcial2Spring.repository;

import com.example.Parcial2Spring.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    List<Curso> findByEstudiantesId(Long estudianteId);
}
