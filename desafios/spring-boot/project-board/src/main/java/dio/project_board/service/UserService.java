package dio.project_board.service;

import dio.project_board.entity.BoardColumnEntity;
import dio.project_board.entity.BoardEntity;
import dio.project_board.nativeQuery.SelectBoardAndColumn;

import java.time.OffsetDateTime;
import java.util.List;

public interface UserService {

    void createBoard(String name, List<BoardColumnEntity> columnEntityList);

    BoardColumnEntity createBoardColumn(String name,String kind);

    void createCard(BoardColumnEntity boardColumn, String name, String description, OffsetDateTime dateTime);

    void deleteBoard(Long id);

    List<SelectBoardAndColumn> displayBoardAndColumn(Long id);

    BoardEntity selectBoard(Long id);

    Long getBoard();
}
