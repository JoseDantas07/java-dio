package List.pesquisaList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CatalogBooks catalogBooks = new CatalogBooks();

        int option;
        do {
            System.out.println("biblioteca");
            System.out.println("[1] Adicionar livro");
            System.out.println("[2] Pesquisar livro pelo autor");
            System.out.println("[3] Pesquisar livro por ano");
            System.out.println("[4] Pesquisar livro por titulo");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1-> {
                    System.out.println("Digite o nome do livro");
                    String name = scanner.nextLine();

                    System.out.println("Digite o nome do autor");
                    String author = scanner.nextLine();

                    System.out.println("Digite o ano do livro");
                    int year = scanner.nextInt();

                    catalogBooks.addBook(name,author,year);
                }
                case 2-> {
                    System.out.println("Digite o nome do autor");
                    String author = scanner.nextLine();

                    System.out.println(catalogBooks.searchByAuthor(author));
                }
                case 3-> {
                    System.out.println("Digite o ano do livro");
                    int startyear = scanner.nextInt();

                    System.out.println("Digite o ano do livro");
                    int endyear = scanner.nextInt();

                    System.out.println(catalogBooks.searchByYearRange(startyear,endyear));
                }
                case 4-> {
                    System.out.println("Digite o nome do livro");
                    String name = scanner.nextLine();

                    System.out.println(catalogBooks.searchByTitle(name));
                }
            }
        }while (option != 0);

    }
}
