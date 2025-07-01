import cadastro.User;
import visual.Interface;

import java.util.Scanner;

public class Main{

    /// falta coisas

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var cliente = new User("jose",21,2000);
        var ativa = true;
        while(ativa){
            Interface.opcao();
            var select = sc.nextInt();
            switch (select){
                case 1:{
                    System.out.printf("Seu saldo atual e de %.2f\n",cliente.getBalance());
                    break;
                }
                case 2:{
                    System.out.printf("O valor do seu cheque especial e de %.2f\n", cliente.getCheck());
                    break;
                }
                case 3:{
                    System.out.print("Quanto você quer deposita: ");
                    cliente.depositMoney();
                    break;
                }
                case 4:{
                    System.out.print("Quanto você quer sacar: ");
                    cliente.withdrawMoney();
                    break;
                }
                case 5:{
                    cliente.payBill();
                    break;
                }
                case 6:{
                    cliente.verifyUsingCheck();
                    break;
                }
                case 7:{
                    System.out.println("Saindo do banco...");
                    ativa = false;
                    break;
                }
            }
        }
    }
}