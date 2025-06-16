import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0;

        System.out.printf("digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("digite o numero da agencia: ");
        String numeroAgencia = sc.nextLine();

        System.out.printf("digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.printf("seu saldo da conta e de " + saldo + " voce deseja colocar mais (SIM) ou (NÃO): ");
        String confirmaSaldo = sc.nextLine();

        if (confirmaSaldo.equalsIgnoreCase("sim")){
            System.out.println("quanto voce quer colocar ? : ");
            saldo = sc.nextDouble();

            System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de : " + saldo + " já está disponível para saque.");
        }else {
            System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + "nao está disponível para saque.");
        }


    }
}
