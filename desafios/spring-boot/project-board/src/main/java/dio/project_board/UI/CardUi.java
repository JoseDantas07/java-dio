package dio.project_board.UI;

import dio.project_board.entity.BoardColumnEntity;
import dio.project_board.entity.BoardEntity;
import dio.project_board.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.Scanner;
@Component
public class CardUi {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    UserServiceImpl userService;


    public void card(BoardEntity boardEntity){
        int option;
        do {
            System.out.println("bem vindo board " + boardEntity.getId());
            System.out.println("[1] Criar card");
            System.out.println("[2] Mover um card");
            System.out.println("[3] Bloquear card");
            System.out.println("[4] Desbloquea Card");
            System.out.println("[5] Cancelar card");
            System.out.println("[6] Ver board completo");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
        }while (option < 1 || option > 6);

        switch (option){
            case 1-> createCard();
            case 2-> moveCardToNextColumn();
            case 3-> blockCard();
            case 4-> unblockCard();
            case 5-> cancelCard();
            case 6-> displayCard();
        }
    }

    private void createCard(){
        System.out.println("Digite o nome");
        String name = scanner.nextLine();
        System.out.println("Digite a descrição");
        String description = scanner.nextLine();
        userService.createCard(new BoardColumnEntity(),name,description, OffsetDateTime.now());
    }
    private void moveCardToNextColumn() {
    }
    private void blockCard() {
    }
    private void unblockCard() {
    }
    private void cancelCard() {
    }
    private void displayCard() {
    }

}
