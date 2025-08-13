import java.util.Scanner;

public class CodigoPromocional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a linha inteira e dividindo em partes pelo ", "
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(", ");

        // Capturando os valores a partir da divisão
        String nome = partes[0];
        int ano = Integer.parseInt(partes[1]);
        int id = Integer.parseInt(partes[2]);

        // Fechando o Scanner para evitar vazamento de recurso
        scanner.close();

        // TODO: Pegue as três primeiras letras do nome e convertendo para maiúsculas:
        nome = nome.toUpperCase();
        nome = nome.substring(0,3);

        // TODO: Pegue o último dígito do ano:
        ano = ano % 10;
        // TODO: Construa o código promocional:
        String codigoProomocional = nome + ano + id;

        // TODO: Exibinda o código promocional gerado:
        System.out.println(codigoProomocional);
    }
}