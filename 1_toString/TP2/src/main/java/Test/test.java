package Test;

import Entities.Estudiante;
import java.util.*;

public class test {
    public static void main(String[] args) {
        // 1. Crear varios objetos Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Ingeniería en Sistemas");
        Estudiante estudiante2 = new Estudiante("María", 22, "Diseño Gráfico");
        Estudiante estudiante3 = new Estudiante("Pedro", 21, "Medicina");

        // 2. Almacenarlos en una lista
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);

        // 3. Mostrar la lista, que ahora usará el toString() que definiste
        System.out.println(listaEstudiantes);
    }
}
