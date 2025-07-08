import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();

        int option;

        do {
            System.out.println("Carrinho de compra");
            System.out.println("[1] Adicionar item ao carrinho");
            System.out.println("[2] Remover item do carrinho");
            System.out.println("[3] Calcular valor total do carrinho");
            System.out.println("[4] exibir itens do carrinho");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Nome do produto");
                    String name = scanner.nextLine();

                    System.out.println("Valor do produto");
                    double price = scanner.nextDouble();

                    System.out.println("Quantidade do produto");
                    int amount = scanner.nextInt();

                    shoppingCart.addItem(name, price, amount);
                }
                case 2 -> {
                    System.out.println("Digite o nome do produto que deseja remover");
                    String name = scanner.nextLine();
                    shoppingCart.removeItem(name);
                }
                case 3 -> shoppingCart.calculateTotalValue();
                case 4 -> shoppingCart.displayItems();
            }
        } while (option != 0);
    }
}
