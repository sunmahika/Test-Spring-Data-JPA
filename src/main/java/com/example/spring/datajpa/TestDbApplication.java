package com.example.spring.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDbApplication.class, args);
		System.out.println("SUCCESS");
		System.out.println("Changes done by me....................");
	}

}
