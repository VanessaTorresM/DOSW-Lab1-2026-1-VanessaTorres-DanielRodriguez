package Laboratorio1.reto2;

import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    static Function<List<Integer>, Integer> maximo =
            lista -> lista.stream().max(Integer::compareTo).orElse(0);

    static Function<List<Integer>, Integer> minimo =
            lista -> lista.stream().min(Integer::compareTo).orElse(0);

    static Function<List<Integer>, Integer> cantidad =
            lista -> lista.size();

    public static void main(String[] args) {
    }
}


