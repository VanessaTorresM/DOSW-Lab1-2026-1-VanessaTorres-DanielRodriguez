package reto5;

import java.util.TreeSet;
import java.util.Set;
import java.util.List;

public class BatallaTreeSet {

    public static Set<Integer> crearTreeSet(List<Integer> listaEntrada) {

        Set<Integer> salida = new TreeSet<>();

        listaEntrada.stream().filter(n -> n % 5 != 0).forEach(salida::add);

        return salida;
    }

    public static void main(String[] args) {

        System.out.println(
                crearTreeSet(List.of(10, 7, 3, 5, 7, 12, 1, 20))
        );
    }
}
