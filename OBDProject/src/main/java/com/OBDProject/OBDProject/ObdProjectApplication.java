package com.OBDProject.OBDProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.OBDProject.OBDProject")
@EnableAutoConfiguration
public class ObdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObdProjectApplication.class, args);
	}
}
