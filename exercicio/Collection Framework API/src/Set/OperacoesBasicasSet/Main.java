package Set.OperacoesBasicasSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuestsSet guestsSet = new GuestsSet();
        int option;

        do {
            System.out.println("Lista de Convidados");
            System.out.println("[1] adicionarConvidado");
            System.out.println("[2] remover Convidado Por Codigo de Convite");
            System.out.println("[3] contarConvidados");
            System.out.println("[4] exibirConvidados");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1 -> {
                    System.out.println("digite o nome");
                    String name = scanner.nextLine();

                    System.out.println("Digite o codigo de convite");
                    int invitationcode = scanner.nextInt();

                    guestsSet.addGuests(name,invitationcode);
                }
                case 2 -> {
                    System.out.println("Digite o codigo de convite para remover");
                    int invitationcode = scanner.nextInt();

                    guestsSet.removerGuest(invitationcode);
                }
                case 3 -> guestsSet.countGuests();
                case 4 -> guestsSet.displayGuest();
            }
        } while (option != 0);

    }
}
