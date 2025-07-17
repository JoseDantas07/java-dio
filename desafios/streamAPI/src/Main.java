import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 1 - Mostre a lista na ordem numérica:
        List<Integer> increasingNumbers = new ArrayList<>(number);
        Collections.sort(increasingNumbers);
        System.out.println(increasingNumbers);

    }
}