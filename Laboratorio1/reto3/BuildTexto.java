package reto3;
import java.util.stream.IntStream;


    public class BuildTexto {
        public static String repetirTresVeces(String mensaje) {

            StringBuilder texto = new StringBuilder();
            IntStream.range(0, 3)
                    .forEach(i -> texto.append(mensaje).append(" "));

            return texto.toString(); }
        public static void main(String[] args) {

            System.out.println(repetirTresVeces("hola"));
        }
    }
