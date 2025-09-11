package Test;

import DTOs.ProductoRecord;
import Entities.Producto;

public class test {
    public static void main(String[] args) {
        Producto memoriaRam = new Producto("444", "Memoria RAM", 54000.00);
        Producto placaDeVideo = new Producto("555", "Placa de video", 596000.00);
        Producto procesador = new Producto("666", "Procesador", 314000.00);

        ProductoRecord r1 = new ProductoRecord(memoriaRam.getCodigo(), memoriaRam.getNombre(), memoriaRam.getPrecio());
        ProductoRecord r2 = new ProductoRecord(placaDeVideo.getCodigo(), placaDeVideo.getNombre(), placaDeVideo.getPrecio());
        ProductoRecord r3 = new ProductoRecord(procesador.getCodigo(), procesador.getNombre(), procesador.getPrecio());
    }
}
