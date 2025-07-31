package dio.project_board.repository;

import dio.project_board.entity.BoardColumnEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardColumnRepository extends JpaRepository<BoardColumnEntity,Long> {
}
