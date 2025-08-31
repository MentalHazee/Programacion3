package Test;

import Entities.Usuario;

public class test {
    public static void main(String[] args) {
        Usuario isaac = Usuario.builder()
                .id(1)
                .nombre("Isaac Newton")
                .email("isaacnewton@spacex.com")
                .build();

        Usuario marie = Usuario.builder()
                .id(2)
                .nombre("Marie Curie")
                .email("mariecurie@xray.com")
                .build();

        System.out.println(isaac);
        System.out.println(marie);
    }
}
