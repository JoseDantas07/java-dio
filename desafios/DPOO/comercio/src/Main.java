import functions.Attendant;
import functions.Manager;
import functions.Seller;
import visual.AreaPeople;
import visual.LoginArea;

import java.util.Scanner;

public class Main {
    /// Manager
    /// User == jose
    /// Password == 0023

    /// Seller
    /// User == ariel
    /// Password == 123

    /// Attendant
    /// User == gabriel
    /// Password == 321

    public static void main(String[] args) {
        LoginArea loginArea = new LoginArea();
        AreaPeople areaPeople = new AreaPeople();
        Manager manager = new Manager();
        Seller seller = new Seller();
        Attendant attendant = new Attendant();

        Scanner scanner = new Scanner(System.in);

        int option;
        int contador = 0;
        do {
            loginArea.loginArea();
            option = scanner.nextInt();
        }while(option <= 0 || option > 3);



        switch (option){
            case 1 ->{
                do {
                    System.out.println("você tem no maximo 3 tentativas depois disso o programa vai voltar pra tela de seleção");
                    System.out.print("Usuario: ");
                    manager.setName(scanner.next());
                    System.out.print("Senha: ");
                    manager.setPassword(scanner.next());
                    contador++;
                    if (contador == 3){
                        loginArea.loginArea();
                        option = scanner.nextInt();
                        contador = 0;
                    }
                }while(!manager.getName().equalsIgnoreCase(manager.getVerifyName()) & !manager.getPassword().equalsIgnoreCase(manager.getVerifyPassword()));
                
                areaPeople.areaManager();
                int funcao = scanner.nextInt();
                switch (funcao) {
                    case 1 -> manager.generateReport();
                    case 2 -> manager.consultSales();
                    case 0 -> {
                        loginArea.loginArea();
                        option = scanner.nextInt();
                    }
                }
            }
            case 2 ->{
                do {
                    System.out.println("você tem no maximo 3 tentativas depois disso o programa vai voltar pra tela de seleção");
                    System.out.print("Usuario: ");
                    seller.setName(scanner.next());
                    System.out.print("Senha: ");
                    seller.setPassword(scanner.next());
                    contador++;
                    if (contador == 3){
                        loginArea.loginArea();
                        option = scanner.nextInt();
                        contador = 0;
                    }
                }while(!seller.getName().equalsIgnoreCase(seller.getVerifyName()) & !seller.getPassword().equalsIgnoreCase(seller.getVerifyPassword()));

                areaPeople.areaSeller();
                int funcao = scanner.nextInt();
                switch (funcao){
                    case 1 -> seller.MakeSale();
                    case 2 -> seller.consultSales();
                    case 0 -> {
                        loginArea.loginArea();
                        option = scanner.nextInt();
                    }
                }

            }
            case 3 ->{
                do {
                    System.out.println("você tem no maximo 3 tentativas depois disso o programa vai voltar pra tela de seleção");
                    System.out.print("Usuario: ");
                    attendant.setName(scanner.next());
                    System.out.print("Senha: ");
                    attendant.setPassword(scanner.next());
                    contador++;
                    if (contador == 3){
                        loginArea.loginArea();
                        option = scanner.nextInt();
                        contador = 0;
                    }
                }while(!attendant.getName().equalsIgnoreCase(attendant.getVerifyName()) & !attendant.getPassword().equalsIgnoreCase(attendant.getVerifyPassword()));
                areaPeople.areaAttendant();
            }
        }
    }
}