package com.film;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FilmExperimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmExperimentApplication.class, args);
	}

}
