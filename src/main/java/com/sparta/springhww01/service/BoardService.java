package com.sparta.springhww01.service;


import com.sparta.springhww01.models.Board;
import com.sparta.springhww01.models.BoardUpdateRequestDto;
import com.sparta.springhww01.models.Boardrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final Boardrepository boardRepository;

    @Transactional
    public Long update(Long id, BoardUpdateRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return id;
    }
}
