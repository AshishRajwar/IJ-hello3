package com.example.hello3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hello3Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello3Application.class, args);
	}

	@GetMapping("/hello3")
	public String getHello()  {

		System.out.println("This is hello3 service");
		System.out.println("This is hello3 service2");
		System.out.println("This is hello3 service2");
		if (true) {
			return "Hello 3";
		} else {
			return "HELLOO 3";
		}
	}

}
