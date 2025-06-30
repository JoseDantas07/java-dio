import java.util.Scanner;

public non-sealed class ChooseMovie extends Cinema{

    public static void chooseMovie(){
        int option;
        do {
            Scanner scanner = new Scanner(System.in);
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

        System.out.println("O preço do filem e de 12 reais");
        System.out.println("[1] Paga meia");
        System.out.println("[2] Pacote familia");
    }

    @Override
    public int getTicketPrice() {
        return 0;
    }
}
