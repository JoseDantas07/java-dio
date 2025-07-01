import java.util.Scanner;

public non-sealed class ChooseMovie extends Cinema{

    public static void chooseMovie(){
        Cinema chooseMovie = new ChooseMovie();
        HalfPrice halfPrice = new HalfPrice();
        FamilyTicket familyTicket = new FamilyTicket();
        Scanner scanner = new Scanner(System.in);
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
        }while(option > 3 || option <= 0);

        System.out.println("O preço do filme e de 12 reais");
        System.out.println("[1] Paga meia");
        System.out.println("[2] Pacote familia");
        System.out.println("[3] Pagar o preço normal");
        int optionPrice = scanner.nextInt();

        switch (optionPrice){
            case 1 -> System.out.println(halfPrice.chooseTicketPrice());
            case 2
        }

        switch (option){
            case 1 ->  {
                chooseMovie.setName("A volta de quem ja foi");
                chooseMovie.setDubbed(true);
            }
            case 2 -> {
                chooseMovie.setName("A procura do tesouro de prata");
                chooseMovie.setDubbed(true);
                chooseMovie.setSubtitled(true);
            }
            case 3 -> {
                chooseMovie.setName("The sino");
                chooseMovie.setSubtitled(true);
            }
        }
    }

    @Override
    public double chooseTicketPrice() {
        return 0;
    }
}
