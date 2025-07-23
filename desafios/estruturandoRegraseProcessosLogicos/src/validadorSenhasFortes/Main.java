package validadorSenhasFortes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.nextLine();

        scanner.close();

        // TODO: Verifique se a senha é válida e imprime o resultado:
        if (validarSenha(senha)){
            System.out.println("senha valida");
        }else {
            System.out.println("senha invalida");
        }

    }

    public static boolean validarSenha(String senha) {

        // TODO: Verifique se a senha tem pelo menos 8 caracteres. Se não tiver, retornar false.
        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        // TODO: Percorra cada caractere da senha e verifique se há pelo menos uma letra maiúscula e um número:
        // DICA: Use um loop para analisar cada caractere e marcar se é maiúscula ou número.
        for (char c : senha.toCharArray()){
            if (Character.isUpperCase(c)){
                temMaiuscula = true;
            }
            if (Character.isLowerCase(c)){
                temMinuscula = true;
            }
            if (Character.isDigit(c)){
                temNumero = true;
            }
        }



        // Se já encontramos uma letra maiúscula e um número, podemos parar a verificação
        if (temMaiuscula && temMinuscula && temNumero) {
            return true;
        }

        return false;
    }
}
