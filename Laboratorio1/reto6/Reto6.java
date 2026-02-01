package reto6;

public class Reto6 {

    public static String fragmento1(String mensaje) {

        switch (mensaje) {

            case "BROMEAR":
                return "“¿Por qué la RAM rompió con la CPU?  \n" +
                        "Porque necesitaba espacio \n";

            case "GRITAR":
                return"¡¡¡ALERTA DE STACK OVERFLOW!!!" ;

            case "SUSURRAR":
                return "Shhh… los bugs están dormidos";

            case "ANALIZAR":
                return "Analizando datos… resultado: ¡Eres increíble programando!";

            default:
                return "Comando desconocido.";
        }
    }

    public static void main(String[] args) {
        System.out.println(fragmento1("SALUDAR"));
        System.out.println(fragmento1("CANTAR"));
        System.out.println(fragmento1("DANZAR"));
        System.out.println(fragmento1("DESPEDIR"));
    }
}

