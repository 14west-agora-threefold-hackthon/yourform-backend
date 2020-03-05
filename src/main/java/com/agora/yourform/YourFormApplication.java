package com.agora.yourform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = { "com.agora.yourform" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class YourFormApplication {

	public static final String HARDCODED_LOOKUP_PROFILE = "hardcoded-lookup";

	public static final String DYNAMIC_LOOKUP_PROFILE = "dynamic-lookup";

	public static void main(String[] args) {
		SpringApplication.run(YourFormApplication.class, args);
	}
}
