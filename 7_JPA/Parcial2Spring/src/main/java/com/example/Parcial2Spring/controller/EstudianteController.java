package com.example.Parcial2Spring.controller;

import com.example.Parcial2Spring.entities.Estudiante;
import com.example.Parcial2Spring.entities.Curso;
import com.example.Parcial2Spring.service.EstudianteService;
import com.example.Parcial2Spring.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
    private final EstudianteService estudianteService;
    public EstudianteController(EstudianteService estudianteService){
        this.estudianteService = estudianteService;
    }

    @GetMapping
    public List<Estudiante> listAll(){
        return estudianteService.findAll();
    }

    @PostMapping
    public Estudiante create(@RequestBody Estudiante e){
        return estudianteService.save(e);
    }
}
