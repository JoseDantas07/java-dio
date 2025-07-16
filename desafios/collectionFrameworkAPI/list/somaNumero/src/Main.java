import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SomaNumeros somaNumeros = new SomaNumeros();

        int option;
        do {
            System.out.println("Somar Numeros");
            System.out.println("[1] adicionarLivro");
            System.out.println("[2] calcularSoma");
            System.out.println("[3] encontrarMaiorNumero");
            System.out.println("[4] encontrarMenorNumero");
            System.out.println("[5] exibirNumeros");
            System.out.println("[0] Sair");
            option = scanner.nextInt();


            switch(option){
                case 1 -> {
                    System.out.println("Digite um numero");
                    int numero = scanner.nextInt();
                    somaNumeros.addNumber(numero);
                }
                case 2 -> somaNumeros.calculateSum();
                case 3 -> somaNumeros.findLargestNumber();
                case 4 -> somaNumeros.findSmallestNumber();
                case 5 -> somaNumeros.displayNumbers();
            }
        }while (option != 0);
    }
}