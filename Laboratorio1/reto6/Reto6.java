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

    public static String resolverComando(String mensaje) {
        switch (mensaje) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                return mensaje;
            default:
                return "DESCONOCIDO";
        }
    }
    public static void ejecutar(String mensaje) {
        String comando = resolverComando(mensaje);
        Runnable accion = comandos.get(comando);

        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando desconocido: " + mensaje);
        }
    }
    public static void main(String[] args) {
        // Pruebas solicitadas
        ejecutar("SALUDAR");
        ejecutar("BROMEAR");
        ejecutar("ANALIZAR");
        ejecutar("DANZAR");
    }


}

