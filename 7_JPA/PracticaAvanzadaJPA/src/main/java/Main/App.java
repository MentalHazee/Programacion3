package Main;

import Entities.*;

import java.util.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidad");
        EntityManager em = emf.createEntityManager();

        //Instancia medicos
        em.getTransaction().begin();
        Medico lucas = Medico.builder()
                .nombre("Lucas")
                .apellido("Orton")
                .edad(45)
                .especialidad("Urología")
                .matricula("EF-68574642")
                .build();
        em.persist(lucas);
        em.getTransaction().commit();

        //Leer medicos
        em.getTransaction().begin();
        List<Medico> medicos = em.createQuery("SELECT p FROM Medico p", Medico.class).getResultList();
        medicos.forEach(p -> System.out.println(p.toString()));
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
