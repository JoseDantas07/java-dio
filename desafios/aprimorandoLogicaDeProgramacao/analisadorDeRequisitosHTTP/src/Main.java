import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia a linha de entrada:
        String info = scanner.nextLine();


        scanner.close();

        // TODO: Divida a string usando espaço como delimitador:
        String primeiraParte = info.split(" ")[0];

        // TODO: Exiba o primeiro elemento (método HTTP):
        System.out.println(primeiraParte);

    }
}