package Test;

import Entities.listaGenericos;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(444);
        numeros.add(555);
        numeros.add(777);

        List<String> letras = new ArrayList<>();
        letras.add("AAA");
        letras.add("BBB");
        letras.add("CCC");

        System.out.println("Lista de numeros: ");
        listaGenericos.imprimirLista(numeros);

        System.out.println("Lista de letras: ");
        listaGenericos.imprimirLista(letras);
    }
}
