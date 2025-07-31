package dio.project_board.UI;

import dio.project_board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MenuUi {
    @Autowired
    UserService userService;
    public void menu(){

        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("[1] Criar card");
            System.out.println("[2] Cancelar card");
            System.out.println("[3] Bloquear card");
            System.out.println("[4] Desbloquea Card");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
        }while (option < 0 || option > 4);

        switch (option){
            case 1->{createCard();}
            case 2->{}
            case 3->{}
            case 4->{}
            case 0->{}
        }
    }
    void createCard(){
        System.out.println("Digite o nome ");

        userService.createBoard();
    }
}
