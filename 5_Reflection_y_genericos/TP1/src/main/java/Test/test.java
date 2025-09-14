package Test;

import Entities.Persona;

import java.lang.reflect.*;

public class test {
    public static void main(String[] args) throws Exception{
        try {
            Persona lucas = new Persona("Lucas Orton", 25);
            lucas.saludar();

            Class<?> personaClass = Persona.class;

            // Constructores
            System.out.println("Constructores de Persona:");
            Constructor<?>[] constructores = personaClass.getDeclaredConstructors();
            for (Constructor<?> c : constructores) {
                System.out.println(c);
            }

            // Instanciar objeto
            Constructor<?> constructor = personaClass.getConstructor(String.class, int.class);
            Object persona = constructor.newInstance("Carlos", 25);

            // Modificar campo privado
            Field campoNombre = personaClass.getDeclaredField("nombre");
            campoNombre.setAccessible(true);
            campoNombre.set(persona, "Ana");

            // Invocar metodo público
            Method mostrarInfo = personaClass.getMethod("mostrarInfo");
            mostrarInfo.invoke(persona);

            // Invocar metodo privado Saludar
            Method saludar = personaClass.getDeclaredMethod("saludar");
            saludar.setAccessible(true);
            Object saludo = saludar.invoke(persona);
            System.out.println("Invocación de Saludar privado: " + saludo);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
