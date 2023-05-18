package com.eccomerce.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EccomerceSystemBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(EccomerceSystemBackendApplication.class, args);
	}

}
