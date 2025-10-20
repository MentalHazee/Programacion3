package com.ge.ejemploC3.services;

import com.ge.ejemploC3.entities.dtos.PersonaCreate;
import com.ge.ejemploC3.entities.dtos.PersonaDto;
import com.ge.ejemploC3.entities.dtos.PersonaEdit;

import java.util.List;

//En el service manejamos como respuesta solo DTOs y recibimos DTOs
public interface PersonaService {
    public PersonaDto crear(PersonaCreate p);
    public PersonaDto actualizar(Long id, PersonaEdit p);
    public PersonaDto buscaId(Long id);
    public List<PersonaDto> buscaTodos();
    public void eliminar(Long id);
}
