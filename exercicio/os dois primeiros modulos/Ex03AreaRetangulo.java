import java.util.Scanner;

public class Ex03AreaRetangulo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("quanto e a base do retangulo ?");
        var baseRetagunlo = sc.nextInt();
        System.out.println("quanto e a altura do retangulo ? ");
        var alturaRetangulo = sc.nextInt();
        System.out.printf("a area do retangulo e %s", baseRetagunlo * alturaRetangulo);
    }
}
