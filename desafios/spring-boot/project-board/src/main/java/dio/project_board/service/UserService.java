package dio.project_board.service;

import java.time.OffsetDateTime;

public interface UserService {

    void createBoard(String name);
    void createBoardColumn(String name,String kind);
    void createCard(String name, String description, OffsetDateTime dateTime);
    void deleteBoard(Long id);
}
