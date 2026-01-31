package reto3;

public class Reto3 {

    public static String combinacion(String mensaje) {

        String repetido = BuildTexto.repetirTresVeces(mensaje);
        String invertido = Buffertext.alreves(repetido);

        return invertido;
    }

    public static void main(String[] args) {
        System.out.println(combinacion("hola"));
    }
}
