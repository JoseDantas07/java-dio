import java.util.Scanner;

public class Ex02LadoQuadrado {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("digite o lado do quadrado");
        var lado = sc.nextInt();
        System.out.printf("a area do quadrado e %s" , lado * 2);
    }
}
