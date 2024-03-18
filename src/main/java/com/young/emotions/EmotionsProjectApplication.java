package com.young.emotions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.young.emotions","com.young.emotions.controller"})
public class EmotionsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmotionsProjectApplication.class, args);
	}

}
