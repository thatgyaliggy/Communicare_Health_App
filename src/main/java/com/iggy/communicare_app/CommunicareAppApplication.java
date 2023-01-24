package com.iggy.communicare_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CommunicareAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicareAppApplication.class, args);
	}
}
