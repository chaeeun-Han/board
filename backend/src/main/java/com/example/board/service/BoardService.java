package com.example.board.service;

import com.example.board.domain.board.Board;
import com.example.board.domain.board.BoardRepository;
import com.example.board.domain.user.User;
import com.example.board.domain.user.UserRepository;
import com.example.board.dto.response.board.FeedBoardResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepo;

    @Transactional
    public List<FeedBoardResponseDto> getLatestPosts() {
        List<Board> posts = boardRepo.findLatestFeed();
        List<FeedBoardResponseDto> feeds = new ArrayList<>();

        for (Board post : posts) {
            User user = post.getUserUid();
            FeedBoardResponseDto dto = FeedBoardResponseDto.of(post, user);
            feeds.add(dto);
        }

        return feeds;
    }

    @Transactional
    public List<FeedBoardResponseDto> getTop3Posts() {
        List<Board> posts = boardRepo.findTop3Feed();
        List<FeedBoardResponseDto> feeds = new ArrayList<>();

        for (Board post : posts) {
            User user = post.getUserUid();
            FeedBoardResponseDto dto = FeedBoardResponseDto.of(post, user);
            feeds.add(dto);
        }

        return feeds;
    }

}
