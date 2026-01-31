package reto3;

public class Buffertext {

    public static String alreves(String texto){
        StringBuffer palabra = new StringBuffer(texto);
        palabra.reverse();
        return palabra.toString();
    }

    public static void main(String[] args) {
        System.out.println(alreves("texto"));
    }
}