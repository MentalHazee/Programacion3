package Test;

import java.util.*;
import java.util.stream.*;

import Entities.Alumno;

public class test {
    public static void main(String[] args) {

        //Creamos la lista de alumnos
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Lucas Orton", 3.5, "Programación 3"),
                new Alumno("Manu Crespoide", 7.5, "Base de Datos"),
                new Alumno("German Marinero", 4.0, "Inglés"),
                new Alumno("Nacho Navarrette", 9.5, "Organización Empresarial"),
                new Alumno("Julian Haze", 9.5, "Inglés")
        );

        //Obtenemos los nombres de los alumnos aprobados en mayusculas y ordenados
        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Aprobados: " + aprobados);

        //Calcular el promedio general de notas
        double promedio = alumnos.stream()
                .collect(Collectors.averagingDouble(Alumno::getNota));
        System.out.println("El promedio general es: " + promedio);

        //Agrupar alumnos por cursado
        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println("Agrupados por curso: " + alumnosPorCurso);

        //Obtener los 3 mejores promedios
        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("El top 3 de alumnos son: " + top3);
    }
}
