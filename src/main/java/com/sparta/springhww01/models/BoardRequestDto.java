package com.sparta.springhww01.models;


import lombok.Getter;

@Getter
public class BoardRequestDto {
    private String title;
    private String name;
    private String pw;
    private String content;
}
