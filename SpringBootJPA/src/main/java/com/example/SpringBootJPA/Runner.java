package com.example.SpringBootJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.info("Runner is running...");

		configWithAnnotationConfig();

	}

	public static void configWithAnnotationConfig() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBootJpaApplication.class);

		Pizza margherita = ctx.getBean("MargheritaPizza", Pizza.class);

		PizzasService pizzaService = ctx.getBean(PizzasService.class);

		pizzaService.save(margherita);

	}

}
