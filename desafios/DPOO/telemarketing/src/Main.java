import servicesMessage.Email;
import servicesMessage.Marketing;
import servicesMessage.Sms;
import servicesMessage.SocialNetwork;
import servicesMessage.WhatsApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual dos serviços você quer receber mensagem");
        System.out.println("[1] Rede social");
        System.out.println("[2] Email");
        System.out.println("[3] WhatsApp");
        System.out.println("[4] Sms");
        System.out.println("[0] Sair");
        int option = scanner.nextInt();

        switch (option){
            case 1 -> getMarketing(new SocialNetwork());
            case 2 -> getMarketing(new Email());
            case 3 -> getMarketing(new WhatsApp());
            case 4 -> getMarketing(new Sms());
        }
    }

    public static void getMarketing(Marketing marketing){
        marketing.message();
    }
}