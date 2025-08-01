package dio.project_board.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "boardEntity", cascade = CascadeType.ALL)
    private List<BoardColumnEntity> boardColumnList;

    public BoardEntity() {
    }

    public BoardEntity(String name, List<BoardColumnEntity> boardColumnList) {
        this.name = name;
        this.boardColumnList = boardColumnList;

        if (boardColumnList != null) {
            for (BoardColumnEntity column : boardColumnList) {
                column.setBoardEntity(this);
            }
        }
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

    public void setBoardColumnList(List<BoardColumnEntity> boardColumnList){
        this.boardColumnList = boardColumnList;
    }

}
