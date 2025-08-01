package dio.project_board.repository;

import dio.project_board.entity.BoardEntity;
import dio.project_board.nativeQuery.SelectBoardAndColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

    @Query("select be.name,bc.name,bc.kind from BoardEntity be join BoardcolumnEntity bc where be.id = :id")
    List<SelectBoardAndColumn> findBoardAndColumn(@Param("id") Long id);
}
