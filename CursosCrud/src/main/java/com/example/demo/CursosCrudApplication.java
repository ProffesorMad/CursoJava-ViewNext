package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.curso.model")
@EnableJpaRepositories(basePackages="com.curso.repository")
@SpringBootApplication(scanBasePackages= {"com.curso.controller","com.curso.service"})

public class CursosCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosCrudApplication.class, args);
	}

}
