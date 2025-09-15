package Test;

import Entities.Caja;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Caja<String> nombre = new Caja<>("Julian");
        Caja<Integer> edad = new Caja<>(28);

        Caja universidad = new Caja<>("UTN");

        System.out.println(nombre.getContenido());
        System.out.println(edad.getContenido());
        System.out.println(universidad.getContenido());

        //Coleccion con genericos

        List<Caja<?>> listaCajas = new ArrayList<>();
        listaCajas.add(nombre);
        listaCajas.add(edad);

        System.out.println("Lista con genericos: " + listaCajas);

        //Coleccion sin genericos

        List listaSinGenericos = new ArrayList();
        listaSinGenericos.add("Julian");
        listaSinGenericos.add(28);


        String texto = (String) listaSinGenericos.get(0);
        Integer numero = (Integer) listaSinGenericos.get(1);

        System.out.println("Lista sin genericos en textos: " + texto);
        System.out.println("Lista sin genericos en numeros: " + numero);
    }
}
