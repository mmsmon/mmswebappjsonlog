package com.swift.mmsapp.mmsappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.Banner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@RestController
public class MmsappspringApplication {
	private static final Logger logger = LogManager.getLogger(MmsappspringApplication.class);

	@RequestMapping("/")
        public String home() {
		logger.info("Message from MMS Application Spring Boot instance");
                return "Message from MMS Application Spring Boot instance";
        }

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MmsappspringApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
