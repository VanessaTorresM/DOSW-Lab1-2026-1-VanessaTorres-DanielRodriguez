package Laboratorio1.reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.List;

public class Tesoro {

    public HashMap<String, Integer> crearHashMap(
            List<Map.Entry<String, Integer>> parejas) {

        HashMap<String, Integer> mapa = new HashMap<>();
        parejas.forEach(p -> mapa.putIfAbsent(p.getKey(), p.getValue()));
        return mapa;
    }

    public Hashtable<String, Integer> crearHashTable(
            List<Map.Entry<String, Integer>> parejas) {

        Hashtable<String, Integer> mapa = new Hashtable<>();
        parejas.forEach(p -> mapa.putIfAbsent(p.getKey(), p.getValue()));
        return mapa;
    }

    public HashMap<String, Integer> combinarMapas(
            List<Map.Entry<String, Integer>> mapa1,
            List<Map.Entry<String, Integer>> mapa2) {

        HashMap<String, Integer> resultado = new HashMap<>();

        mapa1.forEach(e ->
                resultado.putIfAbsent(e.getKey(), e.getValue())
        );

        mapa2.forEach(e ->
                resultado.putIfAbsent(e.getKey(), e.getValue())
        );

        return resultado;
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
        HashMap<String, Integer> resultado = tesoro.combinarMapas(mapa1,mapa2);

        System.out.println(resultado);
    }
}

