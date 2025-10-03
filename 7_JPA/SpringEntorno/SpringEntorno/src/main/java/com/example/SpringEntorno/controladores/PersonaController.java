package com.example.SpringEntorno.controladores;

import com.example.SpringEntorno.entidades.Persona;
import com.example.SpringEntorno.servicios.PersonaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
//Marca la clase como un controlador Spring MVC (capa web).
//Se encarga de manejar las solicitudes HTTP entrantes.
@CrossOrigin("*")
//Permite solicitudes desde cualquier origen (CORS).
//Con "*" estás habilitando todo dominio → útil en desarrollo,
// pero inseguro en producción. Conviene restringir a los dominios confiables.
@RequestMapping("/persona")
//Define la ruta base para todos los endpoints de este controlador.
//Ejemplo: http://localhost:8080/persona/buscaTodos.
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/buscaTodos")
    //Se usa para manejar peticiones HTTP GET.
    //Un GET sirve para obtener datos (no debería modificar nada en el servidor).
    public ResponseEntity<?> buscaTodos() {
        try {
            Map<String, Object> response = new HashMap<>();
            response.put("Personas", personaService.buscaTodas());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("Ocurrio un error", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/buscaId/{id}")
    public ResponseEntity<?> buscaId(@PathVariable Long id) {
        try {
            Map<String, Object> response = new HashMap<>();
            response.put("Persona con el id " + id + " es: ", personaService.buscaId(id));
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("Ocurrio un error", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/crear")
    //Maneja peticiones HTTP POST.
    //Se usa cuando queremos crear un recurso nuevo en el servidor.
    public ResponseEntity<?> crear(@RequestBody Persona p) {
        try {
            Map<String, Object> response = new HashMap<>();
            response.put("Persona creada: ", personaService.guardar(p));
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("Ocurrio un error al guardar", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PutMapping("/editar/{id}")
    //Maneja peticiones HTTP PUT.
    //Se usa para editar o actualizar un recurso completo (reemplazar sus datos con los nuevos).
    public ResponseEntity<?> editar(@PathVariable Long id, @RequestBody Persona p) {
        try {
            Map<String, Object> response = new HashMap<>();
            response.put("Persona editada: ", personaService.actualizar(id, p));
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("Ocurrio un error al editar", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @DeleteMapping("/borrar/{id}")
    //Maneja peticiones HTTP DELETE.
    //Se usa para eliminar un recurso del servidor.
    public ResponseEntity<?> borrar(@PathVariable Long id) {
        try {
            personaService.borrar(id);
            Map<String, Object> response = new HashMap<>();
            response.put("Persona Borrada con el id: ", id);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("Ocurrio un error al guardar", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
}
