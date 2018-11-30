package com.adidas.city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class CityDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityDetailsApplication.class, args);
	}
}
