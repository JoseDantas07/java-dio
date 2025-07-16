import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SetUniqueWords setUniqueWords = new SetUniqueWords();
        int option;

        do{
            System.out.println("[1] adicionarPalavra");
            System.out.println("[2] removerPalavra");
            System.out.println("[3] verificarPalavra");
            System.out.println("[4] exibirPalavrasUnicas");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("Digite a palavra que quer adicionar");
                    String word = scanner.nextLine();
                    setUniqueWords.addWord(word);
                }
                case 2 ->{
                    System.out.println("digite a palavra que quer remover");
                    String word = scanner.nextLine();
                    setUniqueWords.removeWord(word);
                }
                case 3 ->{
                    System.out.println("digite a palavra que quer verificar");
                    String word = scanner.nextLine();
                    System.out.println(setUniqueWords.checkWord(word));
                }
                case 4 -> setUniqueWords.displayUniqueWords();
            }
        }while(option != 0);
    }
}
