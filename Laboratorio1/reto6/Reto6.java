package reto6;

public class Reto6 {

    public static String fragmento1(String mensaje) {

        switch (mensaje) {

            case "SALUDAR":
                return "¡Saludos, viajero del Tiempo y del código!";

            case "DESPEDIR":
                return "Que los bits te acompañen, hasta la próxima misión.";

            case "CANTAR":
                return "01010101";

            case "DANZAR":
                return "Girando en modo fiesta.";

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

