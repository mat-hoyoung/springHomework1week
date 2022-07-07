package com.sparta.springhww01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springhww01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springhww01Application.class, args);
	}

}
