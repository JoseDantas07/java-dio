import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(-2,-1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 1 - Mostre a lista na ordem numérica:
        List<Integer> increasingNumbers = number.stream().sorted().toList();
        System.out.println("Mostra a lista "+ increasingNumbers);

        //Desafio 2 - Imprima a soma dos números pares da lista:
        List<Integer> evenNumbers = number.stream().filter(n -> n % 2 == 0 && n > 0).toList();
        System.out.println("Numeros pares " + evenNumbers);

        //Desafio 3 - Verifique se todos os números da lista são positivos:
        List<Integer> positiveNumbers = number.stream().filter(n -> n > 0).toList();
        System.out.println("Esse numeros são positivo"+ positiveNumbers);

        //Desafio 4 - Remova todos os valores ímpares:
        List<Integer> removeOddNumbers = number.stream().filter(n -> n % 2 == 0 && n > 0).toList();
        System.out.println("Tirando os numeros impares "+removeOddNumbers);

        //Desafio 5 - Calcule a média dos números maiores que 5:
        OptionalDouble calculateAverage = number.stream().filter(n -> n > 5).mapToInt(n -> n).average();
        System.out.println("A media deu "+calculateAverage.getAsDouble());

        //Desafio 6 - Verificar se a lista contém algum número maior que 10:
        List<Integer> numbersGreaterThanTen = number.stream().filter(n -> n > 10).toList();
        System.out.println("Numers maoir que 10 "+ numbersGreaterThanTen);

        //Desafio 7 - Somar os dígitos de todos os números da lista:
        int addNumbers = number.stream().reduce(0,Integer::sum);
        System.out.println("Soma de todos os numeros = "+addNumbers);

        //Desafio 8 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        List<Integer> groupsNumbers = number.stream().filter(n -> n % 2 == 1).filter(n -> n % 3 == 0 || n % 5 == 0).distinct().toList();
        System.out.println("Esses sao o numeros que e ímpares múltiplos de 3 ou de 5 " + groupsNumbers);

        //Desafio 9 - Filtrar os números que estão dentro de um intervalo (por exemplo, entre 5 e 10):
        List<Integer> numbersBetweenFiveAndTen = number.stream().filter(n -> n > 5 && n < 10).toList();
        System.out.println("Esses sao os numeros que estão entre 5 e 10 " + numbersBetweenFiveAndTen);

        //Desafio 10 - Verifique se a lista contém pelo menos um número negativo:
        boolean negativeNumber = number.stream().anyMatch(n -> n < 0);
        System.out.println("Existe pelo menos um numero negativo " + negativeNumber);

        //Desafio 11 - Agrupe os números em pares e ímpares:
        List<Integer> evenNumber = number.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> oddNumber = number.stream().filter(n -> n % 2 == 1).toList();
        System.out.println("Numeros pares " + evenNumber);
        System.out.println("Numeros Impar " + oddNumber);
    }
}