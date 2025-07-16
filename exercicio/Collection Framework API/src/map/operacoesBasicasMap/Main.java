package map.operacoesBasicasMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContactList contactList = new ContactList();

        int option;

        do {
            System.out.println("Lista de contatos");
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Remover contato");
            System.out.println("[3] Exibir contatos");
            System.out.println("[4] Pesquisar por nome");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("Digite o nome");
                    String name = scanner.nextLine();

                    System.out.println("Digite o numero de telefone");
                    Integer number = scanner.nextInt();

                    contactList.addContact(name,number);
                }
                case 2 -> {
                    System.out.println("Digite o nome para remover");
                    String name =scanner.nextLine();

                    contactList.removeContact(name);
                }
                case 3 -> contactList.displayContact();
                case 4 -> {
                    System.out.println("Digite o nome para pesquisar");
                    String name = scanner.nextLine();

                    contactList.searchByName(name);
                }
            }

        }while (option != 0);

    }
}
