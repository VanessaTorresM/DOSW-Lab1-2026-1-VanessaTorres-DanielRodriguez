import java.util.List;
import java. util.Comparator;

public static int calcularMaximo(List<Integer> numeros){
    return numeros.stream().filter(n-> numeros.stream().allMatch(m -> n >= m))
            .findFirst().orElseThrow();
}

void main() {
}

