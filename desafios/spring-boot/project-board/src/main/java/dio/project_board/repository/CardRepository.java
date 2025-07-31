package dio.project_board.repository;

import dio.project_board.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardEntity,Long> {
}
