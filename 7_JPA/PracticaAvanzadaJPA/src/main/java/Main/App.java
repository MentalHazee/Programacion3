package Main;

import Entities.*;

import java.time.*;
import java.util.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidad");
        EntityManager em = emf.createEntityManager();

        //Elimina los regsitros de la tabla especificada (NO SE USA)
        /*em.getTransaction().begin();
        em.createQuery("DELETE FROM Medico").executeUpdate();
        em.createQuery("DELETE FROM Paciente").executeUpdate();
        em.getTransaction().commit();*/

        //Persiste al menos 3 pacientes
        em.getTransaction().begin();

        Paciente ron = Paciente.builder()
                .nombre("Ronald")
                .apellido("Wesley")
                .dni(50463258)
                .edad(17)
                .obraSocial("OSEP")
                .fechaNacimiento(LocalDate.of(2008, 05, 25))
                .sexo('M')
                .build();

        em.getTransaction().commit();

        //Persiste al menos 2 medicos
        em.getTransaction().begin();
        Medico house = Medico.builder()
                .nombre("Gregory")
                .apellido("House")
                .edad(45)
                .especialidad("Clinica Medica")
                .matricula("EF-68574642")
                .build();

        Medico strange = Medico.builder()
                .nombre("Stephen")
                .apellido("Strange")
                .edad(41)
                .especialidad("Cirujano")
                .matricula("BS-221B")
                .build();

        em.persist(house);
        em.persist(strange);

        em.getTransaction().commit();

        //Leer medicos
        em.getTransaction().begin();

        List<Medico> medicos = em.createQuery("SELECT p FROM Medico p", Medico.class).getResultList();
        medicos.forEach(p -> System.out.println(p.toString()));

        List<Paciente> pacientes = em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
        pacientes.forEach(p -> System.out.println(p.toString())); //----------------------> PORQUE NO MUESTRA LOS PACIENTES

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
