

package reto5;

import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

public class Reto5 {

    public static Set<Integer> crearTreeSet(List<Integer> listaEntrada) {

        Set<Integer> salida = new TreeSet<>();

        listaEntrada.stream().filter(n -> n % 5 != 0).forEach(salida::add);

        return salida;
    }

    public static Set<Integer> crearHashSet(List<Integer> listaEntrada) {
        Set<Integer> salida = new HashSet<>();
        listaEntrada.stream()
                .filter(n -> n % 3 != 0)
                .forEach(salida::add);
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(crearTreeSet(List.of(10, 7, 3, 5, 7, 12, 1, 20)));
                System.out.println(crearHashSet(List.of(3,6,77,89,66,5,6,3,1)));
    }

}