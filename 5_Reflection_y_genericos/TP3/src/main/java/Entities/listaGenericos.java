package Entities;

import java.util.List;

public class listaGenericos {

    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }

    }
}
