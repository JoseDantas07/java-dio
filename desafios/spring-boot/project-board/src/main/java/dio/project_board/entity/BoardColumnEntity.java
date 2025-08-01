package dio.project_board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "boardColumn")
public class BoardColumnEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardColumns_id")
    private Long id;

    private String name;

    private String kind;

    @OneToMany(mappedBy = "boardColumnEntity")
    private List<CardEntity> cardList;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private BoardEntity boardEntity;

    public BoardColumnEntity() {
    }

    public BoardColumnEntity(String name, String kind) {
        this.name = name;
        this.kind = kind;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }




}
