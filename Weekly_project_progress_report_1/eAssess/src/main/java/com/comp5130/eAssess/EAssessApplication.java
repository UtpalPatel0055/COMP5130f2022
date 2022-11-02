package com.comp5130.eAssess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.comp5130.eAssess")
public class EAssessApplication {

	public static void main(String[] args) {
		SpringApplication.run(EAssessApplication.class, args);
	}

}
