package dio.project_board.service.impl;

import dio.project_board.entity.BoardColumnEntity;
import dio.project_board.entity.BoardEntity;
import dio.project_board.entity.CardEntity;
import dio.project_board.nativeQuery.SelectBoardAndColumn;
import dio.project_board.repository.BoardColumnRepository;
import dio.project_board.repository.BoardRepository;
import dio.project_board.repository.CardRepository;
import dio.project_board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    BoardRepository boardRepository;
    BoardColumnRepository boardColumnRepository;
    CardRepository cardRepository;
    BoardEntity boardEntity;

    @Override
    public void createBoard(String name, List<BoardColumnEntity> columnEntityList) {
        BoardEntity boardEntity = new BoardEntity(name,columnEntityList);
        boardRepository.save(boardEntity);
    }

    @Override
    public BoardColumnEntity createBoardColumn(String name, String kind) {
        return new BoardColumnEntity(name,kind);
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

    @Override
    public List<SelectBoardAndColumn> displayBoardAndColumn(Long id) {
        return boardRepository.findBoardAndColumn(id);
    }


    @Override
    public void selectBoard(Long id) {
        if (boardRepository.existsById(id)){
            boardEntity.setId(id);
        }
    }

    @Override
    public Long getBoard() {
        return boardEntity.getId();
    }


}
