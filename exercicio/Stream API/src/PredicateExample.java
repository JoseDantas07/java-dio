import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java","python","etherium","mxfr11","tirulipa","c");

        Predicate<String> palavrasMaiorDeCinco = p -> p.length() > 5;

        palavras.stream().filter(palavrasMaiorDeCinco).forEach(System.out::println);
        palavras.stream().filter(p -> p.length() < 5).forEach(System.out::println);
    }
}
