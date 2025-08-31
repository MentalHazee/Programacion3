package Entities;

public class Curso {
    private String nombre;
    private String docente;

    public Curso(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }



    @Override
    public String toString() {
        return nombre +
                " con el docente " + docente;
    }
}
