package functions;

import java.util.Scanner;

public non-sealed class Attendant extends ExtendUser{
    private String verifyName = "gabriel";
    private String verifyPassword = "321";
    private boolean Box = true;
    private int payment;

    Scanner scanner = new Scanner(System.in);


    public void receivePayment(){
        System.out.println("quanto vocer quer depositar");
        int toReceive = scanner.nextInt();
        payment =+ toReceive;
        System.out.println("o valor do caixa e de " +getpayment());
    }
    public void closeBox(){
        setBox(false);
    }
    public String getVerifyName() {
        return verifyName;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public boolean isBox() {
        return Box;
    }

    public void setBox(boolean box) {
        Box = box;
    }

    public int getpayment() {
        return payment;
    }

    public void setpayment(int payment) {
        this.payment = this.payment;
    }
}
