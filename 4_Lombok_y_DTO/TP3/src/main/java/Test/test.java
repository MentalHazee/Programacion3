package Test;

import DTO.ProductoDTO;
import Entities.Producto;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        //Crea objetos de Producto
        Producto ram = new Producto(1, "Memoria RAM", 50.00, "HyperX");
        Producto proce = new Producto(2, "Procesador", 350.00, "Intel");

        //Crea objetos DTO vacios
        ProductoDTO ramDTO = new ProductoDTO();
        ProductoDTO proceDTO = new ProductoDTO();

        List<ProductoDTO> listaDTOs = new ArrayList<>();

        //Carga los productos en el DTO de cada objeto
        ramDTO.setCodigo(ram.getCodigo());
        ramDTO.setNombre(ram.getNombre());
        ramDTO.setPrecio(ram.getPrecio());

        proceDTO.setNombre(proce.getNombre());
        proceDTO.setCodigo(proce.getCodigo());
        proceDTO.setPrecio(proce.getPrecio());

        listaDTOs.add(ramDTO);
        listaDTOs.add(proceDTO);

        //Muestra los datos de la lista
        for(ProductoDTO mueDto : listaDTOs){
            System.out.println("Codigo: " + mueDto.getCodigo());
            System.out.println("Nombre: " + mueDto.getNombre());
            System.out.println("Precio: U$D " + mueDto.getPrecio() + "\n");
        }



    }
}
