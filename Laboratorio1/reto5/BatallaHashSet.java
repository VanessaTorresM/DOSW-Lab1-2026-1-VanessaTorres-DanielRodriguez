
package reto5;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class BatallaHashSet {



    public static Set<Integer> crearHashSet(List<Integer> listaEntrada) {

        Set<Integer> salida = new HashSet<>();

        listaEntrada.stream()
                .filter(n -> n % 3 != 0)
                .forEach(salida::add);

        return salida;
    }

    public static void main(String[] args) {

        System.out.println(
                crearHashSet(List.of(3, 6, 5, 77, 66, 1, 2))
        );
    }
}
