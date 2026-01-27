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

    // ✅ LAMBDA FINAL CORRECTA
    static Function<List<Integer>, ResultadoEstadistico> calcularEstadisticas =
            lista -> {
                int max = maximo.apply(lista);

                boolean esPar = (max % 2 == 0) ? true : false;

                return new ResultadoEstadistico(
                        max,
                        minimo.apply(lista),
                        cantidad.apply(lista),
                        esPar
                );
            };

    public static void main(String[] args) {

        List<Integer> numeros = List.of(5, 9, 2, 9, 1);

        ResultadoEstadistico resultado =
                calcularEstadisticas.apply(numeros);

        System.out.println("Maximo: " + resultado.maximo());
        System.out.println("Minimo: " + resultado.minimo());
        System.out.println("Cantidad: " + resultado.cantidad());
        System.out.println("Es par: " + resultado.maximoEsPar());
    }
}




