package com.example.SpringEntorno.repositorios;

import com.example.SpringEntorno.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// @Repository le dice a Spring que esta interfaz pertenece a la capa de persistencia.
// Aunque JpaRepository ya está registrado por defecto, es buena práctica agregarla por legibilidad y claridad.
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    // Se declara una interfaz que extiende de JpaRepository.
    // Esto le da acceso automático a muchos métodos como findAll(), findById(), save(), deleteById(), etc.
    // El primer parámetro (Persona) es el tipo de la entidad y el segundo (Long) es el tipo de su clave primaria.

    List<Persona> findAllByEliminadoFalse();
    // Se define un metodo de consulta derivada:
    // Spring Data JPA construye la query automáticamente a partir del nombre del método.
    // En este caso, traerá todas las entidades Persona donde el campo "eliminado" sea false.
    // Requiere que la clase Persona tenga un atributo boolean "eliminado".
}
