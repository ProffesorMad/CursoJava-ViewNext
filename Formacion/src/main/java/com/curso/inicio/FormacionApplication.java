package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages = "com.curso.model")
@SpringBootApplication(scanBasePackages = {"com.curso.controller","com.curso.service"})
public class FormacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormacionApplication.class, args);
	}
	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}

}