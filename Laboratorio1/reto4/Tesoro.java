package  reto4;
import java.util.*;

public class Tesoro {

    public HashMap<String, Integer> combinarMapas(
            List<Map.Entry<String, Integer>> mapa1,
            List<Map.Entry<String, Integer>> mapa2) {

        HashMap<String, Integer> resultado = new HashMap<>();

        mapa1.forEach(e ->
                resultado.merge(e.getKey(), e.getValue(), Math::max)
        );

        mapa2.forEach(e ->
                resultado.merge(e.getKey(), e.getValue(), Math::max)
        );

        return resultado;
    }

    public static Map<String, Integer> Mayusculas(Map<String, Integer> mapa) {
        Map<String, Integer> resultado = new HashMap<>();
        mapa.forEach((k, v) -> resultado.put(k.toUpperCase(), v));
        return resultado;
    }

    public static Map<String, Integer> ordenar(Map<String, Integer> mapa) {
        return mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(
                        LinkedHashMap::new,
                        (m, e) -> m.put(e.getKey(), e.getValue()),
                        LinkedHashMap::putAll
                );
    }

    public static void mostrarSalida(Map<String, Integer> mapa) {
        mapa.forEach((k, v) ->
                System.out.println("Clave: " + k + " | Valor: " + v)
        );
    }


    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> mapa1 = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        List<Map.Entry<String, Integer>> mapa2 = List.of(
                Map.entry("plata", 8),
                Map.entry("rubí", 4),
                Map.entry("oro", 12),
                Map.entry("esmeralda", 6)
        );

        Tesoro tesoro = new Tesoro();

        Map<String, Integer> combinado =
                tesoro.combinarMapas(mapa1, mapa2);

        Map<String, Integer> mayus = Mayusculas(combinado);

        Map<String, Integer> ordenado = ordenar(mayus);

        mostrarSalida(ordenado);
    }
}


