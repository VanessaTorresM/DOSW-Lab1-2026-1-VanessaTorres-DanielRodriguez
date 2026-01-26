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
            lista -> new ResultadoEstadistico(
                    maximo.apply(lista),
                    minimo.apply(lista),
                    cantidad.apply(lista)
            );


    public static void main(String[] args) {

        List<Integer> numeros = List.of(5, 9, 2, 9, 1);

        ResultadoEstadistico resultado =
                calcularEstadisticas.apply(numeros);

        System.out.println("Maximo: " + resultado.maximo());
        System.out.println("Minimo: " + resultado.minimo());
        System.out.println("Cantidad: " + resultado.cantidad());
    }
}


