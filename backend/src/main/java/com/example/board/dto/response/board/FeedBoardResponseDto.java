package com.example.board.dto.response.board;

import com.example.board.domain.board.Board;
import com.example.board.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FeedBoardResponseDto {
    private Long boardNumber;
    private String title;
    private String content;
    private String boardTitleImage;
    private int favoriteCount;
    private int commentCount;
    private int viewCount;
    private LocalDateTime writeDatetime;
    private String writerNickname;
    private String writerProfileImage;

    public static FeedBoardResponseDto of(Board board, User user) {
        String imageString = Optional.ofNullable(board.getImage()).orElse("null");

        // 이미지 문자열이 "null"이면 "null" 문자열이 포함된 리스트로 초기화
        List<String> imageList = Arrays.asList(imageString.split("\\s*,\\s*"));

        return FeedBoardResponseDto.builder()
                .boardNumber(board.getBoardNumber())
                .title(board.getTitle())
                .content(board.getContent())
                .boardTitleImage(imageList.get(0))
                .favoriteCount(board.getFavoriteCount())
                .commentCount(board.getCommentCount())
                .viewCount(board.getViewCount())
                .writeDatetime(board.getWriteDatetime())
                .writerNickname(user.getNickname())
                .writerProfileImage(user.getProfileImage())
                .build();
    }
}


