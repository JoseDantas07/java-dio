import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex01Nascimento {
    public static void main(String[] args) {
        var anoAtual = OffsetDateTime.now().getYear();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual e o seu nome ?");
        var nome = sc.nextLine();
        System.out.println("Em que ano voce nasceu ?");
        var ano = sc.nextInt();

        System.out.printf("seu nome é %s e você tem %s idade", nome, (anoAtual - ano));
    }
}
