package reto1;

import java.util.Arrays;
import java.util.List;

public class Reto1 {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Santiago Rodriguez", 22, "daniel.rsuarez@mail.escuelaing.edu.co", 8),
                new Estudiante("Vanessa Torres", 19, "jeimmy.torres-m@mail.escuelaing.edu.co", 6)
        );

        String mensaje = Mensaje.crearMensaje(estudiantes);
        System.out.println(mensaje);
    }
}

