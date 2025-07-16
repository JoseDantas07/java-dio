import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OrderingNumbers orderingNumbers = new OrderingNumbers();

        int option;
        do {
            System.out.println("Ordernação de Numeros");
            System.out.println("[1] Adicionar numero");
            System.out.println("[2] Ordenar ascendente do numero");
            System.out.println("[3] Ordenar descendente do numero");
            System.out.println("[0] Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("Digite o numero");
                    int number = scanner.nextInt();
                    orderingNumbers.addNumber(number);
                }
                case 2 -> System.out.println(orderingNumbers.sortAscending());
                case 3 -> System.out.println(orderingNumbers.sortDescending());
            }
        }while (option != 0);

    }
}