package com.example.board.controller;

import com.example.board.dto.response.board.FeedBoardResponseDto;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("board")
public class BoardApiController {

    private final BoardService boardService;

    // 최신 게시물 리스트
    @GetMapping("latest-list")
    public List<FeedBoardResponseDto> getLatestPosts() {
        return boardService.getLatestPosts();
    }

    // 주간 상위 3 게시물 리스트
    @GetMapping("top-3")
    public List<FeedBoardResponseDto> getTop3Posts() {
        return boardService.getTop3Posts();
    }
}
