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

@Entity
@Table(name = "block")
public class BlockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private Long id;
    private boolean block;
    private boolean unblock;
    private String description;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private CardEntity cardEntity;


    public BlockEntity() {
    }

    public BlockEntity(boolean block, String description) {
        this.block = block;
        this.description = description;
    }



    public boolean getBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean isUnblock() {
        return unblock;
    }

    public void setUnblock(boolean unblock) {
        this.unblock = unblock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CardEntity getCardEntity() {
        return cardEntity;
    }

    public void setCardEntity(CardEntity cardEntity) {
        this.cardEntity = cardEntity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
