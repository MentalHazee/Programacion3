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

        //Persiste al menos 3 pacientes
        /*em.getTransaction().begin();

        Paciente ron = Paciente.builder()
                .nombre("Ronald")
                .apellido("Wesley")
                .dni(50463258)
                .edad(17)
                .obraSocial("OSEP")
                .fechaNacimiento(LocalDate.of(2008, 05, 25))
                .sexo('M')
                .build();
        em.persist(ron);

        Paciente constantine = Paciente.builder()
                .nombre("John")
                .apellido("Constantine")
                .dni(25965415)
                .edad(58)
                .obraSocial("Hell Medical")
                .fechaNacimiento(LocalDate.of(1985, 11, 03))
                .sexo('M')
                .build();
        em.persist(constantine);

        Paciente daenerys = Paciente.builder()
                .nombre("Daenerys")
                .apellido("Targaryen")
                .dni(48526325)
                .edad(24)
                .obraSocial("Fire and blood")
                .fechaNacimiento(LocalDate.of(2001, 01, 15))
                .sexo('M')
                .build();
        em.persist(daenerys);

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
        em.persist(house);

        Medico strange = Medico.builder()
                .nombre("Stephen")
                .apellido("Strange")
                .edad(41)
                .especialidad("Cirujano")
                .matricula("BS-221B")
                .build();
        em.persist(strange);

        em.getTransaction().commit();

        //Persiste 4 consultas
        em.getTransaction().begin();
        Consulta daenerysConsulta = Consulta.builder()
                .fecha(LocalDate.of(2025, 9, 14))
                .diagnostico("Apuñalamiento")
                .paciente(daenerys)
                .medico(strange)
                .build();
        em.persist(daenerysConsulta);

        Consulta constantineConsulta = Consulta.builder()
                .fecha(LocalDate.of(2025, 8, 07))
                .diagnostico("Cancer de pulmon terminal")
                .paciente(constantine)
                .medico(house)
                .build();
        em.persist(constantineConsulta);

        Consulta ronConsulta = Consulta.builder()
                .fecha(LocalDate.of(2025, 9, 13))
                .diagnostico("Vomitos")
                .paciente(ron)
                .medico(house)
                .build();
        em.persist(ronConsulta);

        Consulta ronConsulta2 = Consulta.builder()
                .fecha(LocalDate.of(2025, 3, 02))
                .diagnostico("Intoxicación")
                .paciente(ron)
                .medico(house)
                .build();
        em.persist(ronConsulta2);

        em.getTransaction().commit();

        //Persistir 2 HistoriaClinica
        em.getTransaction().begin();
        HistoriaClinica ronHC = HistoriaClinica.builder()
                .descripcion("Ron fue intoxicado con una pocima del amor que le trajo delirio y alucinaciones. Ademas presentó un cuadro severo de vomitos de babosas")
                .paciente(ron)
                .build();
        em.persist(ronHC);

        HistoriaClinica daenerysHC = HistoriaClinica.builder()
                .descripcion("Daenerys presenta un apuñalamiento en el abdomen causado por una daga.")
                .paciente(daenerys)
                .build();
        em.persist(daenerysHC);

        em.getTransaction().commit();

        //Persistir 3 medicamentos
        em.getTransaction().begin();
        Medicamento tylenol = Medicamento.builder()
                .nombre("Tylenol")
                .droga("Paracetamol")
                .pesoEnGramos(500)
                .build();
        em.persist(tylenol);

        Medicamento augmentin = Medicamento.builder()
                .nombre("Augmentin")
                .droga("Amoxicilina + Ácido clavulánico")
                .pesoEnGramos(875)
                .build();
        em.persist(augmentin);

        Medicamento losec = Medicamento.builder()
                .nombre("Losec")
                .droga("Omeprazol")
                .pesoEnGramos(20)
                .build();
        em.persist(losec);

        //Asigno medicamentos a pacientes
        ron.getMedicamentos().add(losec);
        ron.getMedicamentos().add(augmentin);
        daenerys.getMedicamentos().add(tylenol);
        constantine.getMedicamentos().add(tylenol);

        losec.getPacientes().add(ron);
        augmentin.getPacientes().add(ron);
        tylenol.getPacientes().add(daenerys);
        tylenol.getPacientes().add(constantine);

        em.persist(ron);
        em.persist(daenerys);
        em.persist(constantine);

        em.getTransaction().commit();*/


        //3. Listar todos los pacientes mayores de 30 años
        em.getTransaction().begin();
        List<Paciente> pacientesMayores = em.createQuery("SELECT p FROM Paciente p WHERE p.edad > :edad", Paciente.class)
                .setParameter("edad", 30)
                .getResultList();
        System.out.println("\nLos pacientes mayores de 30 años son: ");
        pacientesMayores.forEach(p -> System.out.println(p));
        em.getTransaction().commit();


        //4. Obtener todas las consultas realizadas por un médico especifico
        em.getTransaction().begin();
        List<Consulta> consulasMedicosEsp = em.createQuery(
                        "SELECT c FROM Consulta c WHERE c.medico.nombre = :nombre", Consulta.class)
                .setParameter("nombre", "Gregory")
                .getResultList();
        System.out.println("\nLas consultas del Dr House son: ");
        consulasMedicosEsp.forEach(c -> System.out.println(c));
        em.getTransaction().commit();


        //5. Mostrar todos los medicamentos asociados a un paciente
        em.getTransaction().begin();
        List<Medicamento> medicamentosPacienteEsp = em.createQuery(
                        "SELECT m FROM Medicamento m JOIN m.pacientes p WHERE p.nombre = :nombre", Medicamento.class)
                .setParameter("nombre", "Ronald")
                .getResultList();
        System.out.println("\nLos medicamentos de Ronald Wesley son: ");
        medicamentosPacienteEsp.forEach(m -> System.out.println(m.getNombre() + " - " + m.getDroga()));
        em.getTransaction().commit();


        //6. Listar las consultas con su diagnóstico y el nombre del paciente
        em.getTransaction().begin();

        em.getTransaction().commit();


        //7. Calcular el promedio de edad de los pacientes.
        //8. Listar todos los pacientes que tienen una obra social específica.
        //9. Mostrar los médicos y la cantidad de consultas que atendieron.
        //10. Obtener todos los pacientes junto con la descripción de su historia clínica.


        //Limpia la BD (NO USAR PARA ELIMINAR, YA QUE SE USA EL FALSE)
        /*em.getTransaction().begin();
        em.createQuery("DELETE FROM Consulta").executeUpdate();
        em.createQuery("DELETE FROM HistoriaClinica").executeUpdate();
        //em.createQuery("DELETE FROM Medicamento").executeUpdate();
        em.createQuery("DELETE FROM Medico").executeUpdate();
        em.createQuery("DELETE FROM Paciente").executeUpdate();
        em.getTransaction().commit();*/

        em.close();
        emf.close();

    }
}
