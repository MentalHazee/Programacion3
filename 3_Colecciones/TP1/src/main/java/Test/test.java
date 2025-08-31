package Test;

import Entities.Alumno;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        Alumno lucas = new Alumno("Lucas Orton", 8.5);
        Alumno german = new Alumno("German Marinaga", 5.0);
        Alumno emmanuel = new Alumno("Manu Crespoide", 9.5);
        Alumno ignacio = new Alumno("Nacho Navarra", 7.0);

        listaAlumnos.add(lucas);
        listaAlumnos.add(german);
        listaAlumnos.add(ignacio);
        listaAlumnos.add(emmanuel);

        
    }
}
