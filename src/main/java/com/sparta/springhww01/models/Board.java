package com.sparta.springhww01.models;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Board extends Timestamped {

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 합니다.
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String pw;

    @Column(nullable = false)
    private String content;



    public Board(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.name = requestDto.getName();
        this.pw = requestDto.getPw();
        this.content = requestDto.getContent();

    }

    public void update(BoardUpdateRequestDto requestDto) {
        this.content = requestDto.getContent();
    }

}
