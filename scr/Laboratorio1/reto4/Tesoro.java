package Laboratorio1.reto4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.List;

public static class Tesoro {

    public HashMap<String,Integer> crearHashMap(
            List<Map.Entry<String, Integer>> parejas){

        HashMap<String, Integer> mapa = new HashMap<>();
        parejas.forEach(p -> mapa.putIfAbsent(p.getKey(), p.getValue()));
        return mapa;
    }

    public Hashtable<String,Integer> crearHashTable(
            List<Map.Entry<String, Integer>> parejas){

        Hashtable<String, Integer> mapa = new Hashtable<>();
        parejas.forEach(p -> mapa.putIfAbsent(p.getKey(), p.getValue()));
        return mapa;
    }
}



    public static void main(String[] args) {
        List< Map.Entry<String, Integer>> mapa =List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

    Tesoro tesoro = new Tesoro();
    HashMap<String,Integer> resultado = tesoro.crearHashMap(mapa);
    System.out.println(resultado);


    }
}
