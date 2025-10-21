package com.example.Parcial2Spring.service;


import com.example.Parcial2Spring.entities.Profesor;
import java.util.List;

public interface ProfesorService {
    List<Profesor> findAll();
    Profesor save(Profesor p);
}
