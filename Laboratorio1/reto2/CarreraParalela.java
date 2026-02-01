package reto2;
import java.util.List;

public class CarreraParalela {
    public static int obtenerMaximo(List<Integer> lista) {
        return lista.stream().max(Integer::compareTo).orElse(0);
    }

    public static int obtenerMinimo(List<Integer> lista) {
        return lista.stream().min(Integer::compareTo).orElse(0);
    }

    public static int obtenerCantidad(List<Integer> lista) {
        return lista.size();
    }

    public static ResultadoEstadistico calcularEstadisticas(List<Integer> lista) {
        int max = obtenerMaximo(lista);
        int cant = obtenerCantidad(lista);

        boolean esPar = (max % 2 == 0);
        boolean esDiv2 = (max % 2 == 0);
        boolean cantPar = (cant % 2 == 0);
        boolean cantImpar = (cant % 2 == 1);

        return new ResultadoEstadistico(
                max,
                obtenerMinimo(lista),
                cant,
                esPar,
                esDiv2,
                cantPar,
                cantImpar
        );
    }

    public static void imprimirResultado(String nombreLista, List<Integer> numeros) {
        ResultadoEstadistico r = calcularEstadisticas(numeros);

        System.out.println("---- " + nombreLista + " ----");
        System.out.println("Maximo: " + r.maximo());
        System.out.println("Minimo: " + r.minimo());
        System.out.println("Cantidad: " + r.cantidad());
        System.out.println("Maximo es par: " + r.maximoPar());
        System.out.println("Maximo divisible por 2: " + r.esDiv2());
        System.out.println("Cantidad es par: " + r.cantPar());
        System.out.println("Cantidad es impar: " + r.cantImpar());
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(20, 40, 12, 4, 2);
        List<Integer> numeros2 = List.of(25, 50, 12, 31, 17, 4, 2);

        imprimirResultado("Lista 1", numeros);
        imprimirResultado("Lista 2", numeros2);
    }
}