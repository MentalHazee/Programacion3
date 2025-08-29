package Test;

import Entities.Curso;
import Entities.Estudiante;
import java.util.*;

public class test {
    public static void main(String[] args) {
        //TP1:
        // 1. Crea varios objetos Estudiante
        Estudiante juan = new Estudiante("Juan", 20, "Ingeniería en Sistemas");
        Estudiante maria = new Estudiante("María", 22, "Diseño Gráfico");
        Estudiante pedro = new Estudiante("Pedro", 21, "Medicina");

        // 2. Almacena los estudiantes en una lista
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(juan);
        listaEstudiantes.add(maria);
        listaEstudiantes.add(pedro);

        // 3. Muestra la lista
        //System.out.println(listaEstudiantes);

        //------------------------------------------------

        //TP2:
        //Crea un curso
        Curso estructura = new Curso(" Estructuras de Datos");

        //Agrega estudiantes al curso
        estructura.agregarEstudiante(juan);
        estructura.agregarEstudiante(maria);
        estructura.agregarEstudiante(pedro);

        //Muestra a los estudiantes de ese curso
        System.out.println(estructura);
    }
}