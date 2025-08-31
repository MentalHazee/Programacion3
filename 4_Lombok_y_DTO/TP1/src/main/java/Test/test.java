package Test;

import Entities.Persona;

public class test {
    public static void main(String[] args) {
        Persona isaac = Persona.builder()
                .nombre("Isaac Newton")
                .edad(382)
                .build();

        Persona marie = Persona.builder()
                .nombre("Marie Curie")
                .edad(158)
                .build();

        Persona carl = Persona.builder()
                .build();

        Persona albert = Persona.builder()
                .build();

        System.out.println(isaac);
        System.out.println(marie);
        System.out.println(carl);
        System.out.println(albert);

    }
}
