package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.domain")
@SpringBootApplication
public class MicroServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProviderApplication.class, args);
	}
}
