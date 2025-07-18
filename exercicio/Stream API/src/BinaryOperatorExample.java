import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream().reduce(0,somar);
        int resultado2 = numeros.stream().reduce(0,Integer::sum);

        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
