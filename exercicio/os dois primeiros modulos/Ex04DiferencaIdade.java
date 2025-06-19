import java.util.Scanner;

public class Ex04DiferencaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var nome = new String[2];
        var idade = new int[2];

        for (int i  = 0;i < 2; i++){
            System.out.println("qual e o seu nome ?");
            nome[i] = sc.nextLine();
            System.out.println("qual e a sua idade ?");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.printf("a diferença de idade e de %s anos!!",idade[0] - idade[1]);

    }
}
