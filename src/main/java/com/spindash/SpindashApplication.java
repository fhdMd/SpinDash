package com.spindash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spindash")
public class SpindashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpindashApplication.class, args);
		System.out.println("Started");
	}

}
