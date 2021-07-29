package com.codingdojo.ninjasdojos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class NinjasDojosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjasDojosApplication.class, args);
	}

}
