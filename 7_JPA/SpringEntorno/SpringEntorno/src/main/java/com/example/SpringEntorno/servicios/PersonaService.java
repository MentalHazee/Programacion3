package com.example.SpringEntorno.servicios;

import com.example.SpringEntorno.entidades.Persona;
import java.util.List;

public interface PersonaService {
    public Persona guardar(Persona p);
    public Persona buscaId(Long id);
    public List<Persona> buscaTodas();
    public Persona actualizar(Long id, Persona p);
    public void borrar(Long id);
}
