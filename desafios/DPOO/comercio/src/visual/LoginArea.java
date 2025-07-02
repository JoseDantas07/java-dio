package visual;

import functions.Manager;
import functions.Seller;
import functions.Attendant;

import java.util.Scanner;

public class LoginArea {
    public void loginArea(){

        Manager manager = new Manager();
        Seller seller = new Seller();
        Attendant attendant = new Attendant();

        System.out.println("Area de Login");
        System.out.println("[1] Gerente");
        System.out.println("[2] Vendedor");
        System.out.println("[3] Atendente");
        System.out.println("[0] Sair");



    }
}
