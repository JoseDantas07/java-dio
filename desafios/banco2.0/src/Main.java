import functions.Bank;
import functions.CheckingAccount;

public class Main {
    public static void main(String[] args) {

        Bank bank = new CheckingAccount("jose","08430561340");
        bank.deposit(500);
        bank.deposit(200);
        bank.withdraw(800);

        bank.displayBalance();

    }
}