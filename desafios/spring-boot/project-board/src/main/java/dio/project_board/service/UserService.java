package dio.project_board.service;

import dio.project_board.entity.BoardColumnEntity;

import java.time.OffsetDateTime;
import java.util.List;

public interface UserService {

    void createBoard(String name, List<BoardColumnEntity> columnEntityList);
    BoardColumnEntity createBoardColumn(String name,String kind);
    void createCard(String name, String description, OffsetDateTime dateTime);
    void deleteBoard(Long id);

    void displayBoardAndColumn(Long id);
}
