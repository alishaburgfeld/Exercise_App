package com.allyoucanexercise.Exercise_App;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ExerciseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandlineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Lets inspect the beans provided by spring boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

}

// guide: spring.io/guides/gs/spring-boot
