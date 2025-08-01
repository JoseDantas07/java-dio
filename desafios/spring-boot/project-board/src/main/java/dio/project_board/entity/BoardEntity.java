package dio.project_board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "boardEntity")
    private List<BoardColumnEntity> boardColumnList;

    public BoardEntity() {
    }

    public BoardEntity(String name, List<BoardColumnEntity> boardColumnList) {
        this.name = name;
        this.boardColumnList = boardColumnList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BoardColumnEntity> getBoardColumnList() {
        return boardColumnList;
    }

    public void setBoardColumnList(List<BoardColumnEntity> boardColumnList) {
        this.boardColumnList = boardColumnList;
    }
}
