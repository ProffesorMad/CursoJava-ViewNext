package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.curso.controller"})
public class Ejemplo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo01Application.class, args);
	}

}
