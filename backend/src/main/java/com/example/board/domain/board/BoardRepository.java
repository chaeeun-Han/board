package com.example.board.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    @Query("SELECT b FROM Board b ORDER BY b.boardNumber DESC")
    List<Board> findLatestFeed();

    @Query("SELECT b FROM Board b ORDER BY b.favoriteCount DESC LIMIT 3")
    List<Board> findTop3Feed();
}
