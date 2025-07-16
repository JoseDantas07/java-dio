import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dictionary dictionary = new Dictionary();

        int option;

        do {
            System.out.println("Dicionario");
            System.out.println("[1] Adicionar palavra");
            System.out.println("[2] Remover palavra");
            System.out.println("[3] Exibir palavras");
            System.out.println("[4] Pesquisar por palavra");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 ->{
                    System.out.println("Digite o nome da palavra");
                    String name = scanner.nextLine();

                    System.out.println("Digite a definição dela");
                    String definition = scanner.nextLine();

                    dictionary.addWord(name,definition);
                }
                case 2 ->{
                    System.out.println("Digite o nome da pralavra para remover");
                    String name = scanner.nextLine();

                    dictionary.removeWord(name);
                }
                case 3 -> dictionary.displayWord();
                case 4 ->{
                    System.out.println("Digite o nome da palavra");
                    String name = scanner.nextLine();

                    System.out.println(dictionary.searchByWord(name));
                }
            }
        }while (option != 0);
    }
}