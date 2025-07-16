import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer,Integer> dobra = n -> n * 2;

        List<Integer> numerosDobrado = numeros.stream().map(dobra).toList();
        List<Integer> numerosDobrado2 = numeros.stream().map(n -> n * 2).toList();

        numerosDobrado.forEach(System.out::println);
        numerosDobrado2.forEach(System.out::println);

    }
}
