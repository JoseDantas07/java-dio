package functions;

import java.util.Scanner;

public non-sealed class ChooseMovie extends Cinema{

    HalfPrice halfPrice = new HalfPrice();
    FamilyTicket familyTicket = new FamilyTicket();
    Scanner scanner = new Scanner(System.in);

    public void chooseMovieInterface() {

        int option;

        do {
            System.out.println("============1===========");
            System.out.println("A volta de quem ja foi");
            System.out.println("Tem Dublado");
            System.out.println("Não tem legenda");
            System.out.println("========================");
            System.out.println("============2============");
            System.out.println("A procura do tesouro de prata");
            System.out.println("Tem Dublado");
            System.out.println("Tem legenda");
            System.out.println("========================");
            System.out.println("============3============");
            System.out.println("The sino");
            System.out.println("Não tem Dublado");
            System.out.println("Tem legenda");
            System.out.println("========================");
            System.out.println("Escolhe de acordo com o numero do filme");
            option = scanner.nextInt();
        } while (option > 3 || option <= 0);

        System.out.println("O preço do filme e de 12 reais");
        System.out.println("[1] Paga meia");
        System.out.println("[2] Pacote familia");
        System.out.println("[3] Pagar o preço normal");
        int optionPrice = scanner.nextInt();

        switch (optionPrice) {
            case 1 -> System.out.println(halfPrice.chooseTicketPrice());
            case 2 -> {
                familyTicket.howManyPeople();
                System.out.printf("O valor do ingresso deu %.2f\n", familyTicket.chooseTicketPrice());
            }
        }

        switch (option) {
            case 1 -> {
                this.setName("A volta de quem ja foi");
                this.setDubbed(true);
            }
            case 2 -> {
                this.setName("A procura do tesouro de prata");
                this.setDubbed(true);
                this.setSubtitled(true);
            }
            case 3 -> {
                this.setName("The sino");
                this.setSubtitled(true);
            }
        }
    }

    public void checkMovie() {
        boolean yesOrNot = true;
        System.out.println("Verificar o estado da compra");
        System.out.println("Nome do filme: " + this.getName());
        System.out.println("É dublado: " + this.isDubbed());
        System.out.println("Tem legenda: " + isSubtitled());
        System.out.println("Para confirma digite Sim");
        System.out.println("para voltar digite voltar");
       do {
           String confirm = scanner.next();
           if (confirm.equalsIgnoreCase("sim")) {
               System.out.println("Compra finalizada");
               yesOrNot = false;
               return;
           } else if (confirm.equalsIgnoreCase("voltar")) {
               chooseMovieInterface();
               checkMovie();
           }else {
               System.out.println("digite um valor válido");
           }
       }while (yesOrNot);
    }

    @Override
    public double chooseTicketPrice() {
        return 0;
    }
}
