package com.anime.anime.search;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimeSearchApplication {
	private final Log LOGGER = LogFactory.getLog(AnimeSearchApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AnimeSearchApplication.class, args);
	}

}
