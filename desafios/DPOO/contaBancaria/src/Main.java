import java.util.Scanner;

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;

        // TODO: Verifica se o saldo inicial é negativo:
        if (saldo < 0){
            // TODO: Retorne a mensagem de erro adequada:
            System.out.println("Erro: O saldo nao pode ser negativo.");
            // TODO: Interrompa a criação do objeto e não continua:
            return;
        }
        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor < 0) { // Verifica se o valor do depósito é inválido
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            return; // Interrompe a execução e não realiza o depósito
        }
        saldo += valor; // Atualiza o saldo apenas se o depósito for válido
    }

    // TODO: Crie o método para exibir as informações da conta:
    public void exibirSaldo(){
        System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f",numero, titular,saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine();

        String titular = scanner.nextLine();

        double saldo = scanner.nextDouble();

        // TODO: Verifique se o saldo inicial é negativo e encerra o programa:
        if (saldo < 0){
            // TODO: Retorne a condição para informar que o saldo nao pode ser negativo:
            scanner.close();
            return;
        }


        double deposito = scanner.nextDouble();

        // Verificação se o depósito é inválido e encerra o programa
        if (deposito < 0) {
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            scanner.close();
            return;
        }

        // TODO: Crie um objeto ContaBancaria com os valores lidos:
        ContaBancaria conta = new ContaBancaria(numero, titular, saldo);

        conta.depositar(deposito);

        conta.exibirSaldo();

        scanner.close();
    }
}