import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        String nome = scanner.nextLine();

        // Lendo o número inteiro (ID)
        int id = scanner.nextInt();

        // TODO: Formate o identificador (minúsculas e sem espaços):
        var identificador = (nome.toLowerCase().replaceAll("\\s+","")  + "-" + id);

        // TODO: Exiba o resultado:
        System.out.println(identificador);

        // Fechando o scanner
        scanner.close();
    }
}