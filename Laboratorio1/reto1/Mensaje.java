import java.util.List;
import java.util.stream.Collectors;

public class Mensaje {
    public static String crearMensaje(List<estudiante>estudiantes){
        String mensaje = estudiantes.stream()
                .map(estudiante -> estudiante.nombre() + ", estudiante de la escuela de" + estudiante.semestre + "semestre de " estudante.edad + "Años" )
                .collect(Collectors.joining "y", "Hola, bienvenidos nosotros somos la pareja conformada por", "Nuestros correos institucionales son")
        String correos = estudiantes.stream().map(est-> est.correo).collect(Collectors.joining("y"));
        return mensaje + correos;

    }
}