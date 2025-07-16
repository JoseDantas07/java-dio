import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WordCount wordCount = new WordCount();

        int option;

        do {
            System.out.println("Contagem de palavra");
            System.out.println("[1] Adicionar palavra");
            System.out.println("[2] Remover palavra");
            System.out.println("[3] Exibir contagem palavras");
            System.out.println("[4] Encontrar palavra mais frequente");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 ->{
                    System.out.println("Digite o nome da palavra");
                    String name = scanner.nextLine();

                    System.out.println("Digite quantas vezes ela se repetiu");
                    Integer count = scanner.nextInt();

                    wordCount.addWord(name,count);
                }
                case 2 ->{
                    System.out.println("Digite o nome da palavra para remover");
                    String name = scanner.nextLine();

                    wordCount.removeWord(name);
                }
                case 3 -> wordCount.displayWord();
                case 4 -> wordCount.findMostFrequentWord();
            }

        }while (option != 0);
    }
}