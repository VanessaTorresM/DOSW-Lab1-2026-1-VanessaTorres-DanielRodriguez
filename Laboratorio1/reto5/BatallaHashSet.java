import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class BatallaHashSet {

    public static Set<Integer> crearHashSet(ArrayList<Integer> listaEntrada) {

        Set<Integer> salida = new HashSet<>();

        listaEntrada.stream()
                .filter(n -> n % 3 != 0)
                .forEach(salida::add);

        return salida;
    }
}
