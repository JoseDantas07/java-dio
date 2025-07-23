package sistemaCalculoFrete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();

        double frete;

        // TODO: Crie uma estrutura condicional para determinar o valor do frete:
        // TODO: Se o peso for até 1kg, o frete é R$5,00
        // TODO: Se o peso for entre 1kg e 5kg, o frete é R$10,00
        // TODO: Se o peso for acima de 5kg, o frete é R$20,00
        if (peso <= 1) {
            frete = 5;
        } else if (peso > 1 && peso < 5) {
            frete = 10;
        } else {
            frete = 20;
        }


        // TODO: Exiba o valor do frete formatado (com duas casas decimais):
        System.out.printf("R$%.2f", frete);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}



