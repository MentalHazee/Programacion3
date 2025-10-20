package com.example.Parcial2Spring.controller;

import com.example.Parcial2Spring.entities.Profesor;
import com.example.Parcial2Spring.service.ProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")

public class ProfesorController {
    private final ProfesorService profesorService;
    public ProfesorController(ProfesorService profesorService){
        this.profesorService = profesorService;
    }

    @GetMapping
    public List<Profesor> listAll() {
        return profesorService.findAll();
    }

    @PostMapping
    public Profesor create(@RequestBody Profesor p){
        return profesorService.save(p);
    }
}
