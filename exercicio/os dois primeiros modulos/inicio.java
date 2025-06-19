import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Quantos anos você tem ?");
        var idade = sc.nextInt();
        System.out.println("voce é emancipado ? ");
        var isEmancipado = sc.nextBoolean();
        var canDrive = idade >= 18 || (isEmancipado && idade >= 16);
        System.out.printf("você pode dirigir? (%s) \n", canDrive);

        System.out.println("digite o primeiro numero");
        var n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        var n2 = sc.nextInt();
        System.out.printf("%s + %s = %s", n1, n2, n1 + n2);


    }
}
