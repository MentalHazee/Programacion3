package Test;

import Entities.Producto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        Set<Producto> catalogo = new HashSet<>();
        Producto zapatillas = new Producto(5665, "Nike", 75.00);
        Producto zapatillas2 = new Producto(56655, "Adidas", 120.00);
        Producto zapatillas3 = new Producto(5664, "Puma", 85.00);
        Producto zapatillas4 = new Producto(5665, "Nike", 75.00);
        Producto zapatillas5 = new Producto(56655, "Nike", 120.00);

        catalogo.add(zapatillas);
        catalogo.add(zapatillas2);
        catalogo.add(zapatillas3);
        catalogo.add(zapatillas4);
        catalogo.add(zapatillas5);

        System.out.println("Tamaño del HashSet: " + catalogo.size());

        for (Producto x : catalogo){
            System.out.println(x);
        }

    }
}

