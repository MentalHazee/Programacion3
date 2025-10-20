package com.example.Parcial2Spring.repository;

import com.example.Parcial2Spring.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
