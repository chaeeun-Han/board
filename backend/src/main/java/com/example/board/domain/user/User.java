package com.example.board.domain.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert // default 값 설정에 필요
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_uid")
    private Long userUid;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    // 명세에 칼럼이 있어서 작성하긴 하는데 추후 뺄 예정
    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 20)
    private String nickname;

    @Column(nullable = false, length = 15)
    private String telNumber;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String address;

    @Column(columnDefinition = "TEXT")
    private String addressDetail;

    @Column(columnDefinition = "TEXT")
    private String profileImage;

    @ColumnDefault("false")
    @Column(nullable = false)
    private boolean agreedPersonal;
}

