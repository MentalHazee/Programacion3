package Test;

import Entities.Producto;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Producto> listaDeProductos = new ArrayList<>();
        Producto zapatillas = new Producto(5665, "Nike", 75.00);
        Producto zapatillas2 = new Producto(56655, "Nike", 120.00);
        Producto zapatillas3 = new Producto(5664, "Puma", 85.00);
        Producto zapatillasDuplicadas = new Producto(5665, "Nike", 75.00);

        listaDeProductos.add(zapatillas);
        listaDeProductos.add(zapatillas2);
        listaDeProductos.add(zapatillas3);

        System.out.println("Equals: " + listaDeProductos.contains(zapatillasDuplicadas));



    }
}

