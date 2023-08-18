package com.digit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootAppApplication.class, args);
		System.out.println("Hello spring boot");
	}

}
