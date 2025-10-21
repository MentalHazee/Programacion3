package com.example.Parcial2Spring;

import com.example.Parcial2Spring.entities.Estudiante;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Parcial2SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Parcial2SpringApplication.class, args);
		Estudiante est = Estudiante.builder()
				.nombre("Jose")
				.build();
	}

}
