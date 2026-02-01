
package reto5;

import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Stream;
import java.util.stream.Collectors;


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

    public static Set<Integer> unirColecciones(
            Set<Integer> hashSet,
            Set<Integer> treeSet) {

        return Stream.concat(hashSet.stream(), treeSet.stream()).distinct()
                .collect(Collectors.toCollection(TreeSet::new));
    }




    public static void main(String[] args) {

        Set<Integer> hash = crearHashSet(List.of(4, 9, 15, 7, 18, 21, 10, 5));

        Set<Integer> tree = crearTreeSet(List.of(12, 3, 25, 10, 7, 30, 18, 4));

        Set<Integer> union = unirColecciones(hash, tree);

        union.forEach(n -> System.out.println("Número en arena: " + n));
    }

}