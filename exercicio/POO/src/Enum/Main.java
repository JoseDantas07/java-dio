package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = -1;
        while (option != 0) {
            System.out.println("[1] Somar");
            System.out.println("[2] Subtração");
            System.out.println("[3] Mutiplcação");
            System.out.println("[4] Divisão");
            System.out.println("[0] sair");
            option = scanner.nextInt();

            if (option < 0 || option > 4 ) {
                System.out.println("Opção invalida");
            }

            if (option == 0) break;

            OperationEnum selectOption = OperationEnum.values()[option -1];

            System.out.println("Digite o primeiro numero");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo numero");
            int n2 = scanner.nextInt();

            Integer result = selectOption.getCalculate().apply(n1,n2);

            System.out.printf("%s %s %s = %s\n",n1,selectOption.getSymbol(),n2,result);
        }
    }
}
