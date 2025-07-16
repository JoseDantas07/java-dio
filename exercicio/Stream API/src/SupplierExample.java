import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Seja bem vindo";

        List<String> listaSaudacao = Stream.generate(saudacao).limit(5).toList();
        List<String> listaSaudacao2 = Stream.generate(() -> "Oi eu sou o goku").limit(3).toList();

        listaSaudacao.forEach(System.out::println);
        listaSaudacao2.stream().forEach(System.out::println);

    }
}
