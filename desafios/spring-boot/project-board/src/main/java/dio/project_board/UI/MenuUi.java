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
            System.out.println("[1] Criar board");
            System.out.println("[2] deletar board");
            System.out.println("[3] procura board");
            System.out.println("[4] Criar card");
            System.out.println("[5] Cancelar card");
            System.out.println("[6] Bloquear card");
            System.out.println("[7] Desbloquea Card");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option < 0 || option > 5);

        switch (option){
            case 1->{createBoardColumn();}
            case 2->{
                System.out.println("Digite o id do board para deletar");
                userServiceImpl.deleteBoard(scanner.nextLong());
            }
            case 3->{
                System.out.println("Digite o id do board");
                userServiceImpl.displayBoardAndColumn(scanner.nextLong());
            }
            case 4->{}
            case 5->{}
            case 6->{}
            case 7->{}
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
        String initialColumnName = scanner.nextLine();
        var initialColumn = userServiceImpl.createBoardColumn(initialColumnName,"initial");
        columnEntityList.add(initialColumn);

        for (int i = 0 ; i <= moreColumn ; i++){
            System.out.println("Digite o nome da coluna pedente do board");
            String pendingColumnName = scanner.nextLine();
            BoardColumnEntity pendingColumn = userServiceImpl.createBoardColumn(pendingColumnName,"pending");
            columnEntityList.add(pendingColumn);
        }

        System.out.println("Digite o nome da coluna de final do board");
        String finalColumnName = scanner.nextLine();
        BoardColumnEntity finalColumn = userServiceImpl.createBoardColumn(finalColumnName,"final");
        columnEntityList.add(finalColumn);

        System.out.println("Digite o nome da coluna de cancelamento do board");
        String cancelColumnName = scanner.nextLine();
        BoardColumnEntity cancelColumn = userServiceImpl.createBoardColumn(cancelColumnName,"cancel");
        columnEntityList.add(cancelColumn);

        userServiceImpl.createBoard(nameBoard,columnEntityList);
    }
}
