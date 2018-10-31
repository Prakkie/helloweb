package com.example.tryouts.helloweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class HellowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowebApplication.class, args);
	}
}
