package com.example.board.domain.board;

import com.example.board.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert // default 값 설정에 필요
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_number")
    private Long boardNumber;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Column(nullable = false)
    private int favoriteCount;

    @Column(nullable = false)
    private int commentCount;

    @Column(nullable = false)
    private int viewCount;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime writeDatetime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_uid")
    private User userUid;
}
