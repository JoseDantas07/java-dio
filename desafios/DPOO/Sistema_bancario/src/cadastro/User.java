package cadastro;

import java.util.Scanner;

public class User {

    private String name;
    private int age;
    private double balance;
    private double check;
    private boolean usedCheck;

    public static Scanner sc = new Scanner(System.in);

    public User(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
        precoDoCheque(balance,check);
    }
    public void precoDoCheque(double balance, double check){
        if (balance <= 500){
            this.check = 50;
        }if (balance > 500){
            this.check = balance/2;
        }
    }

    public void depositMoney(){
        var deposit = sc.nextInt();
        this.balance += deposit;
        System.out.println(balance);
    }

    public void withdrawMoney(){
        var ativa = true;
        while(ativa){
            var withdraw = sc.nextInt();
            if (withdraw <= balance){
                this.balance -= withdraw;
                System.out.printf("seu saldo atual e de: %s\n",balance);
                ativa = false;
            }else{
                System.out.print("Você não tem saldo suficiente, por favor digite um valor menor ou igual ao que voce tem na conta:");
            }
        }
    }

    public void verifyUsingCheck(){
        while (true){
            System.out.println("Como padrão nos desabilita o cheque especial");
            System.out.println("Você quer habilitar o cheque especial: [S/N]");
            var ifCheck = sc.nextLine();
            if(ifCheck.equalsIgnoreCase("s") || ifCheck.equalsIgnoreCase("sim") ){
                System.out.println("Ok vamos usar o seu cheque especial");
                usedCheck = true;
                break;
            }else if(ifCheck.equalsIgnoreCase("n") || ifCheck.equalsIgnoreCase("nao")){
                System.out.println("Ok nao vamos usar o seu cheque especial");
                usedCheck = false;
                break;
            }else{
                System.out.println("Digite um valor valido");
            }
        }
    }

    public void payBill(){
        System.out.println("Boleto-001");
        System.out.println("Deseja paga esse boleto: [S/N]");
        if (usedCheck) {
            while (true) {
                var toPay = sc.nextLine();
                if (balance >= 500) {
                    var withiInterest = (check * 0.2) + 500;
                    if (toPay.equalsIgnoreCase("s") || toPay.equalsIgnoreCase("sim")) {
                        balance -= withiInterest;
                        System.out.printf("Boleto pago cheque especial: %s\n", usedCheck);
                        System.out.printf("Seu saldo atual e: %s\n", balance);
                        break;
                    } else if (toPay.equalsIgnoreCase("n") || toPay.equalsIgnoreCase("nao")) {
                        System.out.println("Ok iremos voltar");
                        break;
                    } else {
                        System.out.println("Digite um valor valido");
                    }
                } else {
                    System.out.println("nao tem saldo suficiente");
                    System.out.println("deposite mais Dinheiro");
                    break;
                }
            }
        } else {
            while (true) {
                var toPay = sc.nextLine();
                if (balance >= 500) {
                    if (toPay.equalsIgnoreCase("s") || toPay.equalsIgnoreCase("sim")) {
                        balance -= 500;
                        System.out.printf("Boleto pago cheque especial: %s", usedCheck);
                        System.out.printf("Seu saldo atual e: %s", balance);
                        break;
                    } else if (toPay.equalsIgnoreCase("n") || toPay.equalsIgnoreCase("nao")) {
                        System.out.println("Ok iremos voltar");
                        break;
                    } else {
                        System.out.println("Digite um valor valido");
                    }
                } else {
                    System.out.println("nao tem saldo suficiente");
                    System.out.println("deposite mais Dinheiro");
                    break;
                }
            }
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
      return balance;
    }
    public double getCheck(){
        return check;
    }


}
