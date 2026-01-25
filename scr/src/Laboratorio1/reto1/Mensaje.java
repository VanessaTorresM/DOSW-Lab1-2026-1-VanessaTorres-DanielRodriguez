package Laboratorio1.reto1;

import java.util.List;
import java.util.stream.Collectors;

public class Mensaje {

    public static String crearMensaje(List<Estudiante> estudiantes) {

        String mensaje = estudiantes.stream()
                .map(est -> est.nombre() + ", estudiante de la escuela de " + est.semestre() + ".° semestre de " + est.edad() + " años")
                .collect(Collectors.joining(" y ", "¡Hola, bienvenidos! Nosotros somos la pareja conformada por ", ". Nuestros correos institucionales son "
                ));

        String correos = estudiantes.stream()
                .map(Estudiante::correo)
                .collect(Collectors.joining(" y "));

        return mensaje + correos + ".";
    }
}
