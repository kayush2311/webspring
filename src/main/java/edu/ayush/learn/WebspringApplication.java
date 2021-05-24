package edu.ayush.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"edu.ayush.learn"})
public class WebspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebspringApplication.class, args);
	}

}
