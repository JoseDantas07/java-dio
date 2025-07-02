import functions.Attendant;
import functions.Manager;
import functions.Seller;
import visual.LoginArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginArea loginArea = new LoginArea();
        Manager manager = new Manager();
        Seller seller = new Seller();
        Attendant attendant = new Attendant();

        Scanner scanner = new Scanner(System.in);

        loginArea.loginArea();
        int option = scanner.nextInt();


        switch (option){
            case 1 ->{
                do {
                    System.out.print("Usuario: ");
                    manager.setName(scanner.next());
                    System.out.print("Senha: ");
                    manager.setPassword(scanner.next());
                }while(manager.getName().equalsIgnoreCase(manager.getVerifyName()) && manager.getPassword().equalsIgnoreCase(manager.getVerifyPassword()));
            }
            case 2 ->{
                do {
                    System.out.print("Usuario: ");
                    seller.setName(scanner.next());
                    System.out.print("Senha: ");
                    seller.setPassword(scanner.next());
                }while(seller.getName().equalsIgnoreCase(seller.getVerifyName()) && seller.getPassword().equalsIgnoreCase(seller.getVerifyPassword()));
            }
            case 3 ->{
                do {
                    System.out.print("Usuario: ");
                    attendant.setName(scanner.next());
                    System.out.print("Senha: ");
                    attendant.setPassword(scanner.next());
                }while(attendant.getName().equalsIgnoreCase(attendant.getVerifyName()) && attendant.getPassword().equalsIgnoreCase(attendant.getVerifyPassword()));
            }
        }
        System.out.println(manager.getName());
    }
}