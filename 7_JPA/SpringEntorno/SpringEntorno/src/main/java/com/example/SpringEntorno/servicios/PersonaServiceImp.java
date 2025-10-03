package com.example.SpringEntorno.servicios;

import com.example.SpringEntorno.entidades.Persona;
import com.example.SpringEntorno.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//   - Es un estereotipo de Spring que marca esta clase como parte de la CAPA DE SERVICIO.
//   - Le indica a Spring que esta clase debe ser detectada automáticamente (Component Scan)
//     y registrada como un Bean dentro del contenedor de Spring.
//   - Semánticamente se usa en la "lógica de negocio", diferenciándola de:
//       @Repository (acceso a datos)
//       @Controller / @RestController (controladores web)
//   - Beneficio: mantiene la arquitectura clara y separada por responsabilidades.

public class PersonaServiceImp implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    // @Autowired:
    //   - Le dice a Spring que debe inyectar automáticamente una instancia del Bean PersonaRepository aquí.
    //   - Gracias a esto, no necesitamos instanciar el repositorio manualmente con "new".
    //   - El contenedor de Spring se encarga de crear y administrar el objeto.
    //   - PersonaRepository es una interfaz, pero Spring Data JPA crea una implementación en tiempo de ejecución
    //     y la inyecta aquí.

    @Override
    public Persona guardar(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona buscaId(Long id) {
        Optional<Persona> pO = personaRepository.findById(id);
        if (pO.isEmpty()) {
            return null;
        } else {
            return pO.get();
        }
    }

    @Override
    public List<Persona> buscaTodas() {
        return personaRepository.findAllByEliminadoFalse();
    }

    @Override
    public Persona actualizar(Long id, Persona p) {
        Optional<Persona> pO = personaRepository.findById(id);
        Persona p1 = new Persona();
        if (!pO.isEmpty()) {
            p1 = pO.get();
            p1.setNombre(p.getNombre());
            p1.setApellido(p.getApellido());
            p1.setDni(p.getDni());
            p1.setEdad(p.getEdad());
            return personaRepository.save(p1);
        }
        return null;
    }

    @Override
    public void borrar(Long id) {
        Optional<Persona> pO = personaRepository.findById(id);
        Persona p1 = new Persona();
        if (!pO.isEmpty()) {
            p1 = pO.get();
            p1.setEliminado(true);
            personaRepository.save(p1);
        }

    }
}
