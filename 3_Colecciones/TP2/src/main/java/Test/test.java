package Test;

import Entities.Producto;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        //Crea el HashSet de productos
        HashSet<Producto> listaProductos = new HashSet<>();

        //Crea los objetos
        Producto ram = new Producto(1, "Memoria RAM");
        Producto ramDup = new Producto(1, "Memoria RAM");
        Producto proce = new Producto(2, "Procesador");
        Producto ssd = new Producto(3, "Memoria SSD");
        Producto placa = new Producto(4, "Placa de video");
        Producto placaDup = new Producto(4, "Placa de video");

        //Añade los productos a la lista HashSet
        listaProductos.add(ram);
        listaProductos.add(ramDup);
        listaProductos.add(proce);
        listaProductos.add(ssd);
        listaProductos.add(placa);
        listaProductos.add(placaDup);

        //Recorre e imprime los productos sin los repetidos
        for(Producto rRecProd : listaProductos){
            System.out.println(rRecProd);
        }
    }
}
