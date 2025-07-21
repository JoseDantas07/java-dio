import functions.Bank;
import functions.CheckingAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank contaCorrete = new CheckingAccount();

        contaCorrete.addUser("jose","08430561340","josedantas2.0@gmail.com");
        contaCorrete.addUser("jon","45826317935","jon@gmail.com");
        contaCorrete.loginUser("45826317935");

    }
}