package com.example.SpringEntorno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Esta anotación marca la clase principal como el punto de entrada de la
//aplicación Spring Boot y habilita la configuración automática y el escaneo de
//componentes.
public class SpringEntornoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEntornoApplication.class, args);
    }

}
