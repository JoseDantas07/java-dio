package Set.ordenacaoSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductRegistration productRegistration = new ProductRegistration();

        int option;

        do {
            System.out.println("Estoque");
            System.out.println("[1] Adicionar produto");
            System.out.println("[2] Exibir produtos por nome");
            System.out.println("[3] Exibir produtos por preco");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("Digite o codigo do produto");
                    long cod = scanner.nextLong();

                    System.out.println("Digite o nome do produto");
                    String name = scanner.nextLine();

                    System.out.println("Digite o preço do produto");
                    double price = scanner.nextDouble();

                    System.out.println("Digite a quantidade");
                    int amount = scanner.nextInt();

                    productRegistration.addProduct(cod,name,price,amount);
                }
                case 2 -> System.out.println(productRegistration.displayProductByName());
                case 3 -> System.out.println(productRegistration.displayProductByPrice());
            }
        }while (option != 0);
    }

}
