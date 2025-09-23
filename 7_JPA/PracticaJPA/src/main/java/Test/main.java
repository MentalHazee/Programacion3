/*import Entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

// Crear EntityManagerFactory usando el persistence-unit definido en persistence.xml
EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidad");
        EntityManager em = emf.createEntityManager();

        // Insertar personas
        em.getTransaction().begin();
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Ana", 30);
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();

        // Leer personas
        em.getTransaction().begin();
        List<Persona> personas = em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
        personas.forEach(p -> System.out.println(p.getNombre() + " - " + p.getEdad()));
        em.getTransaction().commit();

        // Cerrar EntityManager y EntityManagerFactory
        em.close();
        emf.close();*/