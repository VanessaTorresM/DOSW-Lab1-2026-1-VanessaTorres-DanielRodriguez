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
            lista -> {
                int max = maximo.apply(lista);

                int cant = cantidad.apply(lista);

                boolean esPar = (max % 2 == 0) ? true : false;
                boolean esDiv2 = (max % 2 == 0) ? true : false;
                boolean cantPar = (cant % 2 == 0) ? true : false;
                boolean cantImpar = (cant % 2 == 1) ? true : false;

                return new ResultadoEstadistico(
                        max,
                        minimo.apply(lista),
                        cantidad.apply(lista),
                        esPar,
                        esDiv2,
                        cantPar,
                        cantImpar

                );
            };

    public static void main(String[] args) {

        List<Integer> numeros = List.of(20, 40, 12, 4, 2);



        ResultadoEstadistico resultado =
                calcularEstadisticas.apply(numeros);
        System.out.println("Maximo: " + resultado.maximo());
        System.out.println("Minimo: " + resultado.minimo());
        System.out.println("Cantidad: " + resultado.cantidad());

        System.out.println("Es par: " + resultado.maximoPar());
        System.out.println("Es Divisor de 2: " + resultado.esDiv2());

        System.out.println("Es par: " + resultado.maximoPar());
        System.out.println("Es Divisor de 2: " + resultado.esDiv2());
        System.out.println("la cantidad de datos es par: " + resultado.cantPar());
        System.out.println("la cantidad de datos es impar: " + resultado.cantImpar());

    }
}




