package com.newtest.newtest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@OpenAPIDefinition

public class NewtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewtestApplication.class, args);
	}

}
