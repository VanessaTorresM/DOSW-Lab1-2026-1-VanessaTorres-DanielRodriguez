package reto6;
import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {

        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del Tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…"));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh… los bugs están dormidos"));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) { Runnable accion;

        switch (comando) {
            case "SALUDAR":
                accion = comandos.get("SALUDAR");
                break;
            case "DESPEDIR":
                accion = comandos.get("DESPEDIR");
                break;
            case "CANTAR":
                accion = comandos.get("CANTAR");
                break;
            case "DANZAR":
                accion = comandos.get("DANZAR");
                break;
            case "BROMEAR":
                accion = comandos.get("BROMEAR");
                break;
            case "GRITAR":
                accion = comandos.get("GRITAR");
                break;
            case "SUSURRAR":
                accion = comandos.get("SUSURRAR");
                break;
            case "ANALIZAR":
                accion = comandos.get("ANALIZAR");
                break;
            default:
                System.out.println("Comando desconocido: " + comando);
                return;
        }

        accion.run();
    }

    public static void main(String[] args) {

        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
        ejecutarComando("CANTAR");
        ejecutarComando("SUSURRAR");
    }
}

