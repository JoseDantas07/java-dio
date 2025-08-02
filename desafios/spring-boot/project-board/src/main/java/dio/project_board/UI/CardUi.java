package dio.project_board.UI;

import dio.project_board.entity.BoardEntity;
import dio.project_board.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class CardUi {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    UserServiceImpl userService;
    BoardEntity boardEntity;

    public void Card(){
        int option;
        do {
            System.out.println("bem vindo board " + boardEntity.getId());
            System.out.println("[1] Criar card");
            System.out.println("[2] Cancelar card");
            System.out.println("[3] Bloquear card");
            System.out.println("[4] Desbloquea Card");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
        }while (option < 0 || option > 4);

        switch (option){
            case 1->{}
            case 2->{}
            case 3->{}
            case 4->{}
        }
    }
}
