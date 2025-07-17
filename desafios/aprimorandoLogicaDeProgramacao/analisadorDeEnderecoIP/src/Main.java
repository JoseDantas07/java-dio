import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        scanner.close();

        // TODO: Verifique se o IP é válido e imprima o resultado
        // TODO: Chame o método validarIP passando o IP como parâmetro e imprimir "ip valido" ou "ip invalido"
        System.out.println(validarIP(ip));
        // DICA: Use um if-else para verificar o retorno do método validarIP
        if (validarIP(ip)) {
            System.out.println("ip valido");
        } else {
            System.out.println("ip invalido");
        }
    }

    // Método para validar um endereço IP
    public static boolean validarIP(String ip) {
        // TODO: Divida a string IP pelo caractere "." e armazenar as partes em um array
        String[] parteIP = ip.split("\\.");
        // DICA: Use o método split(".")

        // TODO: Verificque se o array contém exatamente 4 partes
        if (parteIP.length != 4) return false;
        // DICA: Se não tiver 4 partes, o IP é inválido (retorne false)

        // TODO: Percorra cada parte do array e verificar se é um número válido
        for (String parte : parteIP) {
            if (!ehNumeroValido(parte)) return false;
        }
        // DICA: Use um loop for para percorrer todas as partes do IP
        // DICA: Para verificar se a parte é válida, chame o método ehNumeroValido(parte)

        return true;
    }

    // Método auxiliar para verificar se uma string representa um número válido entre 0 e 255
    private static boolean ehNumeroValido(String str) {
        try {
            int num = Integer.parseInt(str);
            return num >= 0 && num <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
