package com.example.Jenkins_learn;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsLearnApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsLearnApplication.class);


	@PostConstruct
	public void intt() {
		logger.info("Application started");
	}


	public static void main(String[] args) {
		logger.info("Application executed");

		SpringApplication.run(JenkinsLearnApplication.class, args);
	}

}
