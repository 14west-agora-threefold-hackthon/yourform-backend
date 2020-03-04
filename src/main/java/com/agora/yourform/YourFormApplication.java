package com.agora.yourform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.agora.yourform" })
public class YourFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(YourFormApplication.class, args);
	}
}
