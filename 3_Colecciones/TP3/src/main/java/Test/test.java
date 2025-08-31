package Test;

import Entities.Curso;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        //Crea el Map de cursos
        Map<String, Curso> cursos = new HashMap<>();

        //Agrega cursos a el Map
        cursos.put("1", new Curso("Matematica", "Isaac"));
        cursos.put("2", new Curso("Fisica", "Albert"));
        cursos.put("3", new Curso("Literatura", "Edgar"));
        cursos.put("4", new Curso("Quimica", "Marie"));

        //Muestra la cantidad de cursos
        System.out.println("Cantidad de cursos: " + cursos.size() + "\n");

        //Recupera cursos por clave
        if(cursos.containsKey("2")){
            Curso cursoRecu = cursos.get("2");
            System.out.println("El curso recuperado con codigo es: " + cursoRecu + "\n");
        }

        //Recorre el Map con el entrySet()
        for(Map.Entry<String, Curso> entrada : cursos.entrySet()){
            String codigo = entrada.getKey();
            Curso curso = entrada.getValue();
            System.out.println("Codigo: " + codigo + " -> " + curso);
        }

    }
}
