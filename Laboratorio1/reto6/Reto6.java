
import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static{

        comandos.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…"));

        comandos.put("GRITAR", () -> System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!"));

        comandos.put("SUSURRAR", () -> System.out.println("Shhh… los bugs están dormidos"));

        comandos.put("ANALIZAR", () -> System.out.println("Analizando datos… resultado: ¡Eres increíble programando!"));

    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando).run();
                break;
            default:
                System.out.println("Comando desconocido: " + comando);
        }
    }

    public static void main(String[] args) {

        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
    }

}


