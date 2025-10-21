package com.example.Parcial2Spring.controller;

import com.example.Parcial2Spring.entities.Curso;
import com.example.Parcial2Spring.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/cursos")

public class CursoController {
   private final CursoService cursoService;

   public CursoController(CursoService cursoService) {
       this.cursoService = cursoService;
   }

    @GetMapping
    public List<Curso> listAll() {
        return cursoService.findAll();
    }

    @PostMapping
    public Curso create(@RequestBody Curso c) {
        return cursoService.save(c);
    }

    // Asignar estudiante a un curso
    @PostMapping("/{courseId}/students/{studentId}")
    public Curso assignStudent(@PathVariable Long courseId, @PathVariable Long studentId) {
        return cursoService.assignEstudianteToCurso(courseId, studentId);
    }
}
