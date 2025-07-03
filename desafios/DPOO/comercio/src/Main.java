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
        int funcao;
        boolean verifyLogin = true;

        do {
            loginArea.loginArea();
            option = scanner.nextInt();
        }while(option <= 0 || option > 3);

        do {
            switch (option){
                case 1 ->{
                    do {
                        if (contador == 3){
                            loginArea.loginArea();
                            option = scanner.nextInt();
                            contador = 0;
                        }
                        System.out.println("você tem no maximo 3 tentativas depois disso o programa vai voltar pra tela de seleção");
                        System.out.print("Usuario: ");
                        manager.setName(scanner.next());
                        System.out.print("Senha: ");
                        manager.setPassword(scanner.next());

                        contador++;
                        if (manager.getName().equalsIgnoreCase(manager.getVerifyName()) && manager.getPassword().equalsIgnoreCase(manager.getVerifyPassword())){
                            verifyLogin = false;
                        }
                    }while(verifyLogin);
                    contador = 0;
                    do {
                        areaPeople.areaManager();
                        funcao = scanner.nextInt();

                        switch (funcao) {
                            case 1 -> manager.generateReport();
                            case 2 -> seller.getMakeSale();
                            case 0 -> {
                                loginArea.loginArea();
                                option = scanner.nextInt();
                                verifyLogin = true;
                            }
                        }
                    }while (funcao != 0);

                }
                case 2 ->{
                    do {
                        if (contador == 3){
                            loginArea.loginArea();
                            option = scanner.nextInt();
                            contador = 0;
                        }
                        System.out.println("você tem no maximo 3 tentativas depois disso o programa vai voltar pra tela de seleção");
                        System.out.print("Usuario: ");
                        seller.setName(scanner.next());
                        System.out.print("Senha: ");
                        seller.setPassword(scanner.next());
                        contador++;
                        if (seller.getName().equalsIgnoreCase(seller.getVerifyName()) && seller.getPassword().equalsIgnoreCase(seller.getVerifyPassword())){
                            verifyLogin = false;
                        }
                    }while(verifyLogin);
                    contador = 0;
                    do {
                        areaPeople.areaSeller();
                        funcao = scanner.nextInt();
                        switch (funcao){
                            case 1 -> seller.MakeSale();
                            case 2 -> seller.getMakeSale();
                            case 0 -> {
                                loginArea.loginArea();
                                option = scanner.nextInt();
                                verifyLogin = true;
                            }
                        }
                    }while(funcao != 0);

                }
                case 3 ->{
                    do {
                        if (contador == 2){
                            loginArea.loginArea();
                            option = scanner.nextInt();
                            contador = 0;
                        }
                        System.out.println("você tem no maximo 3 tentativas depois disso o programa vai voltar pra tela de seleção");
                        System.out.print("Usuario: ");
                        attendant.setName(scanner.next());
                        System.out.print("Senha: ");
                        attendant.setPassword(scanner.next());
                        contador++;
                        if (attendant.getName().equalsIgnoreCase(attendant.getVerifyName()) && attendant.getPassword().equalsIgnoreCase(attendant.getVerifyPassword())){
                            verifyLogin = false;
                        }
                    }while(verifyLogin);
                    contador = 0;
                    do {
                        areaPeople.areaAttendant();
                        funcao = scanner.nextInt();
                        switch (funcao){
                            case 1 -> {
                                if (attendant.isBox()) {
                                    attendant.receivePayment();
                                }else{
                                    System.out.println("o caixa esta fechado");
                                }
                            }
                            case 2 -> {
                                attendant.closeBox();
                                System.out.println("O caixa esta " + attendant.isBox());
                            }
                            case 0 ->{
                                loginArea.loginArea();
                                option = scanner.nextInt();
                                verifyLogin = true;
                            }
                        }
                    }while (funcao != 0);

                }
            }
        }while(option != 0);
        System.out.println("saindo...");
    }
}