package com.aws.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsApplication {
	@GetMapping("/")
	public String home() {
		return "CI/CD Deployment For Spring Boot Application";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsApplication.class, args);
	}

}
