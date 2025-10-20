package com.example.Parcial2Spring.controller;

import com.example.Parcial2Spring.entities.Curso;
import com.example.Parcial2Spring.entities.Estudiante;
import com.example.Parcial2Spring.entities.Profesor;
import com.example.Parcial2Spring.entities.dto.CursoDto;
import com.example.Parcial2Spring.service.CursoService;
import com.example.Parcial2Spring.service.EstudianteService;
import com.example.Parcial2Spring.service.ProfesorService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/cursos")

public class CursoController {
    private final CursoService cursoService;
    private final EstudianteService estudianteService;
    private final ProfesorService profesorService;

    public CursoController(CursoService cursoService,
                           EstudianteService estudianteService,
                           ProfesorService profesorService) {
        this.cursoService = cursoService;
        this.estudianteService = estudianteService;
        this.profesorService = profesorService;
    }

    @GetMapping
    public List<Curso> listAll() {
        return cursoService.findAll();
    }

    @PostMapping
    public Curso create(@RequestBody CursoDto dto){
        Profesor profesor = profesorService.findById(dto.getProfesorId())
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));

        Curso curso = new Curso();
        curso.setNombre(dto.getNombre());
        curso.setProfesor(profesor);

        return cursoService.save(curso);
    }

    @PostMapping("/{cursoId}/assign-estudiantes")
    public Curso assignEstudiantes(@PathVariable Long cursoId, @RequestBody List<Long> estudianteIds){
        Curso curso = cursoService.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        for (Long estudianteId : estudianteIds) {
            Estudiante estudiante = estudianteService.findById(estudianteId)
                    .orElseThrow(() -> new RuntimeException("Estudiante no encontrado: " + estudianteId));
            curso.getEstudiantes().add(estudiante);
        }

        return cursoService.save(curso);
    }

    @GetMapping("/{cursoId}/estudiantes")
    public Set<Estudiante> getEstudiantes(@PathVariable Long cursoId) {
        Curso curso = cursoService.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        return curso.getEstudiantes();
    }
}
