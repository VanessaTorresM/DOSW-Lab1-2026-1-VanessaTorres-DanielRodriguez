package Laboratorio1.reto2;
import java.util.List;
import java.util.function.Function;
public class CarreraParalela {
    static Function<List<Integer>, Integer> maximo =
            lista -> lista.stream()
                    .max(Integer::compareTo)
                    .orElse(0);

    static Function<List<Integer>, Integer> minimo =
            lista -> lista.stream()
                    .min(Integer::compareTo)
                    .orElse(0);

    static Function<List<Integer>, Integer> cantidad =
            lista -> lista.size();


    static Function<List<Integer>, ResultadoEstadistico> calcularEstadisticas =
            lista -> {
                int max = maximo.apply(lista);

                int cant = cantidad.apply(lista);

                boolean esPar = (max % 2 == 0) ? true : false;
                boolean esDiv2 = (max % 2 == 0) ? true : false;
                boolean cantPar = (cant % 2 == 0) ? true : false;
                boolean cantImpar = (cant % 2 == 1) ? true : false;

                return new ResultadoEstadistico(
                        max,
                        minimo.apply(lista),
                        cantidad.apply(lista),
                        esPar,
                        esDiv2,
                        cantPar,
                        cantImpar

                );
            };
    static void imprimirResultado(String nombreLista, List<Integer> numeros) {
        ResultadoEstadistico r = calcularEstadisticas.apply(numeros);

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




