package com.sparta.springhww01.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Boardrepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedAtDesc();
}
