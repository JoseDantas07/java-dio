package map.pesquisaMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StockProducts stockProducts = new StockProducts();

        int option;

        do {
            System.out.println("Estoque");
            System.out.println("[1] Adicionar produto");
            System.out.println("[2] Exibir produtos");
            System.out.println("[3] Calcular valor total estoque");
            System.out.println("[4] Obter produto mais caro");
            System.out.println("[5] Obter produto mais barato");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1->{
                    System.out.println("Digite o codigo do produto");
                    long cod = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Digite o nome do produto");
                    String name = scanner.nextLine();

                    System.out.println("Digite a quantidade do produto");
                    int amount = scanner.nextInt();

                    System.out.println("Digite o preço do produto");
                    double price = scanner.nextDouble();

                    stockProducts.addProduct(cod,name,amount,price);
                }
                case 2-> stockProducts.displayProduct();
                case 3-> System.out.println(stockProducts.calculateTotalStockValue());
                case 4-> System.out.println(stockProducts.getMostExpensiveProduct());
                case 5-> System.out.println(stockProducts.getCheaperProduct());
            }
        }while (option != 0);
    }
}
