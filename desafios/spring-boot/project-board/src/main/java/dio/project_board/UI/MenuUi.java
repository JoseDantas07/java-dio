package dio.project_board.UI;

import dio.project_board.entity.BoardColumnEntity;
import dio.project_board.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class MenuUi {
    @Autowired
    UserServiceImpl userServiceImpl;

    public Scanner scanner = new Scanner(System.in);
    public void menu(){

        int option;

        do {
            System.out.println("[1] Criar card");
            System.out.println("[2] Cancelar card");
            System.out.println("[3] Bloquear card");
            System.out.println("[4] Desbloquea Card");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option < 0 || option > 4);

        switch (option){
            case 1->{createBoardColumn();}
            case 2->{}
            case 3->{}
            case 4->{}
            case 0->{}
        }
    }

    void createBoardColumn(){

        System.out.println("Digite o nome do board");
        String nameBoard = scanner.nextLine();

        System.out.println("Voce quer mais de 3 columans se sim digite a quantidade se nao digite 0");
        int moreColumn = scanner.nextInt();
        scanner.nextLine();

        List<BoardColumnEntity> columnEntityList = new ArrayList<>();

        System.out.println("Digite o nome da coluna inicial do board");
        String nameColumnInitial = scanner.nextLine();
        var initialColumnName = userServiceImpl.createBoardColumn(nameColumnInitial,"initial");
        columnEntityList.add(initialColumnName);

        for (int i = 0 ; i <= moreColumn ; i++){
            System.out.println("Digite o nome da coluna pedente do board");
            String nameColumnPending = scanner.nextLine();
            BoardColumnEntity pendingColumnName = userServiceImpl.createBoardColumn(nameColumnPending,"pending");
            columnEntityList.add(pendingColumnName);
        }

        System.out.println("Digite o nome da coluna de cancelamento do board");
        String nameColumnCancel = scanner.nextLine();
        BoardColumnEntity cancelColumnName = userServiceImpl.createBoardColumn(nameColumnCancel,"cancel");
        columnEntityList.add(cancelColumnName);

        userServiceImpl.createBoard(nameBoard,columnEntityList);
    }
}
