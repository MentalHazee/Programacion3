package com.example.Parcial2Spring.controller;

import com.example.Parcial2Spring.entities.Curso;
import com.example.Parcial2Spring.entities.dto.CursoDto;
import com.example.Parcial2Spring.service.CursoService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cursos")
@Transactional
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoDto> listAll() {
        return cursoService.findAll().stream()
                .map(c -> {
                    c.getEstudiantes().size(); // carga explícita antes del map
                    return toDTO(c);
                }).collect(Collectors.toList());
    }

    @PostMapping
    public Curso create(@RequestBody Curso c) {
        return cursoService.save(c);
    }

    @PostMapping("/{courseId}/students/{studentId}")
    public Curso assignStudent(@PathVariable Long courseId, @PathVariable Long studentId) {
        return cursoService.assignEstudianteToCurso(courseId, studentId);
    }

    // Mapper de entidad a DTO
    private CursoDto toDTO(Curso curso) {
        CursoDto dto = new CursoDto();
        dto.setId(curso.getId());
        dto.setNombre(curso.getNombre());
        dto.setProfesorNombre(curso.getProfesor().getNombre());
        dto.setEstudiantesNombres(
                curso.getEstudiantes().stream().map(e -> e.getNombre()).collect(Collectors.toSet())
        );
        return dto;
    }
}
