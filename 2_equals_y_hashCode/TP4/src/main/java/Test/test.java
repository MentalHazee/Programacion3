package Test;

import Entities.Producto;

public class test {
    public static void main(String[] args) {
        Producto zapatillas = new Producto(5665, "Nike", 75.00);
        Producto zapatillas2 = new Producto(5665, "Nike", 75.00);

        System.out.println("Zapatillas repetidas: " + zapatillas2.equals(zapatillas) );

        Producto zapatillas3 = new Producto(5664, "Puma", 75.00);
        Producto zapatillas4 = new Producto(5655, "Adidas", 75.00);

        System.out.println("Zapatillas repetidas: " + zapatillas3.equals(zapatillas4));
    }
}
