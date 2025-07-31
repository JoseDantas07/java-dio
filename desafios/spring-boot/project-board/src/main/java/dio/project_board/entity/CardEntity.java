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

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "Card")
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "boardColumns_id")
    private BoardColumnEntity boardColumnEntity;

    @OneToMany(mappedBy = "cardEntity")
    private List<BlockEntity> blockEntity;

    private String name;

    private String description;

    private boolean completed;

    private OffsetDateTime dateTimeBeginning;

    private OffsetDateTime dateTimeEnd;

    public CardEntity() {
    }

    public CardEntity(String description, String name, OffsetDateTime dateTimeBeginning) {
        this.description = description;
        this.name = name;
        this.dateTimeBeginning = dateTimeBeginning;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public OffsetDateTime getDateTimeBeginning() {
        return dateTimeBeginning;
    }

    public void setDateTimeBeginning(OffsetDateTime dateTimeBeginning) {
        this.dateTimeBeginning = dateTimeBeginning;
    }

    public OffsetDateTime getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(OffsetDateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }
}
