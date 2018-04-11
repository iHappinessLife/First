package com.rs.myboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybootApplication {


	public static void main(String[] args) {

		int i = 10;
		System.out.println(++i);

		SpringApplication.run(MybootApplication.class, args);
	}
}
