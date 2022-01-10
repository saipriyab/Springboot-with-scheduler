package com.example.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootWithSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithSchedulerApplication.class, args);
	}

}
