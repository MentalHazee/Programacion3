package com.ge.ejemploC3.services;

import com.ge.ejemploC3.entities.Persona;
import com.ge.ejemploC3.entities.dtos.PersonaCreate;
import com.ge.ejemploC3.entities.dtos.PersonaDto;
import com.ge.ejemploC3.entities.dtos.PersonaEdit;
import com.ge.ejemploC3.entities.dtos.PersonaMapper;
import com.ge.ejemploC3.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImp implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public PersonaDto crear(PersonaCreate p) {
        // Se transforma el DTO de creación en una entidad Persona lista para ser persistida.
        Persona persona = PersonaMapper.toEntity(p);

        // Se guarda la entidad en la base de datos a través del repositorio.
        // save() retorna la entidad con el ID generado.
        persona = personaRepository.save(persona);

        // Se convierte nuevamente la entidad persistida en un DTO de salida.
        // Esto asegura que solo se expongan los datos necesarios.
        PersonaDto personaDto = PersonaMapper.toTDO(persona);

        // Se retorna el DTO con la información final (incluye ID generado).
        return personaDto;
    }
    @Override
    public PersonaDto actualizar(Long id, PersonaEdit p) {
        // Se busca en la base de datos la Persona por su ID.
        // El repositorio retorna un Optional, que puede contener la entidad o estar vacío.
        Optional<Persona> personaOptional = personaRepository.findById(id);

        //SOLUCION OPTIMA AUN NO EXPLICADA
        //Persona person = personaRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del desarrollador");

        // Se valida si la Persona existe.
        if(personaOptional.isPresent()){
            // Si existe, se obtiene la entidad.
            Persona persona = personaOptional.get();

            // Se actualizan los campos permitidos con los valores del DTO de edición.
            persona.setEdad(p.getEdad());
            persona.setContrasena(p.getContrasena());

            // Se guarda nuevamente la entidad actualizada en la base de datos.
            persona = personaRepository.save(persona);

            // Se convierte la entidad persistida a un DTO de salida para retornarla.
            return PersonaMapper.toTDO(persona);
        }

        return null;
    }

    @Override
    public PersonaDto buscaId(Long id) {
        Optional<Persona> personaOptional = personaRepository.findById(id);
        if (personaOptional.isPresent() ){
            if (!personaOptional.get().isEliminado())
                return PersonaMapper.toTDO(personaOptional.get());
        }
        return null;
    }

    @Override
    public List<PersonaDto> buscaTodos() {
        List<Persona> personas = personaRepository.findAllByEliminadoFalse();
        List<PersonaDto> personaDtos = personas.stream().map(PersonaMapper::toTDO).toList();
        return personaDtos;
    }

    @Override
    public void eliminar(Long id) {
        Optional<Persona> persona = personaRepository.findById(id);
        if (persona.isPresent()){
            Persona p = persona.get();
            p.setEliminado(true);
            personaRepository.save(p);
        }
    }
}
