package dio.project_board.service.impl;

import dio.project_board.entity.BoardColumnEntity;
import dio.project_board.entity.BoardEntity;
import dio.project_board.entity.CardEntity;
import dio.project_board.repository.BoardColumnRepository;
import dio.project_board.repository.BoardRepository;
import dio.project_board.repository.CardRepository;
import dio.project_board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    BoardRepository boardRepository;
    BoardColumnRepository boardColumnRepository;
    CardRepository cardRepository;

    @Override
    public void createBoard(String name) {
        BoardEntity boardEntity = new BoardEntity(name);
        boardRepository.save(boardEntity);
    }

    @Override
    public void createBoardColumn(String name, String kind) {
        BoardColumnEntity boardColumnEntity = new BoardColumnEntity(name,kind);
        boardColumnRepository.save(boardColumnEntity);
    }

    @Override
    public void createCard(String name, String description, OffsetDateTime dateTime) {
        CardEntity cardEntity = new CardEntity(name ,description,dateTime);
        cardRepository.save(cardEntity);
    }

    @Override
    public void deleteBoard(Long id) {
        if (boardRepository.existsById(id)){
            boardRepository.deleteById(id);
        }else {
            System.out.println("Nao foi possivel achar o id: " + id);
        }
    }
}
