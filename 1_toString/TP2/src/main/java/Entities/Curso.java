package Entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaDeEstudiantes = null;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String nombre, List<Estudiante> listaDeEstudiantes) {
        this.nombre = nombre;
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public void setListaDeEstudiantes(List<Estudiante> listaDeEstudiantes) {
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (this.listaDeEstudiantes == null) {
            this.listaDeEstudiantes = new ArrayList();
        }
        this.listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", listaDeEstudiantes=" + listaDeEstudiantes +
                '}';
    }
}
