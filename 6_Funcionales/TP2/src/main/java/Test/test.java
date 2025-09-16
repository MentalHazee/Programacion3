package Test;

import Entities.Producto;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Procesador", "Computacion", 352.00, 10),
                new Producto("Memoria RAM", "Computacion", 58.00, 25),
                new Producto("Pantalon jean", "Ropa", 45.00, 7),
                new Producto("Sillon", "Home", 682.00, 3),
                new Producto("Buzo", "Ropa", 58.00, 5)
        );

        //Listar productos con precios mayor a 100 de forma descendente
        List<Producto> productosMayor = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();
        productosMayor.forEach(System.out::println);

        //Agrupar productos por categoría y calcular el stock total
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        stockPorCategoria.forEach((cat, stock) ->
                System.out.println(cat + " -> Stock total: " + stock)
        );

        //Generar un String separando con “;” cada producto que contenga nombre y precio
        String productosString = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println(productosString);

        //Calcular el precio promedio general y por categoría
        double promedioTotal = productos.stream()
                .collect(Collectors.averagingDouble(Producto::getPrecio));
        System.out.println("El promedio total es: " + promedioTotal);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));
        System.out.println("El promedio por categoria es: " + promedioPorCategoria);
    }
}
