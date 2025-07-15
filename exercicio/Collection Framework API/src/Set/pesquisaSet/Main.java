package Set.pesquisaSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AgendaContacts agendaContacts = new AgendaContacts();

        int option;

        do {
            System.out.println("Lista de contatos");
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Exibir contatos");
            System.out.println("[3] Pesquisar por nome");
            System.out.println("[4] Atualizar numero de contato");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1->{
                    System.out.println("Nome do contato");
                    String name = scanner.nextLine();
                    System.out.println("Numero do contato");
                    int number = scanner.nextInt();

                    agendaContacts.addContacts(name,number);
                }
                case 2-> agendaContacts.displayContacts();
                case 3->{
                    System.out.println("digite o nome do contato");
                    String name = scanner.nextLine();

                    System.out.println(agendaContacts.searchByName(name));
                }
                case 4->{
                    System.out.println("Nome do contato");
                    String name = scanner.nextLine();

                    System.out.println("Digite o nome do novo numero");
                    int number = scanner.nextInt();

                    agendaContacts.updateContactNumber(name,number);
                }
            }

        }while (option != 0);


    }
}
