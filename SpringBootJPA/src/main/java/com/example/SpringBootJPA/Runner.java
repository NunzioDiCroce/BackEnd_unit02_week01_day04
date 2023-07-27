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

		PizzasService pizzaService = ctx.getBean(PizzasService.class);
		log.info("");
		log.info("* * * * * * * * * * SAVE * * * * * * * * * *");
		Pizza margherita = ctx.getBean("MargheritaPizza", Pizza.class);
//		pizzaService.save(margherita);

		Pizza hawaiian = ctx.getBean("HawaiianPizza", Pizza.class);
//		pizzaService.save(hawaiian);

		Pizza salami = ctx.getBean("SalamiPizza", Pizza.class);
//		pizzaService.save(salami);
		log.info("");

		log.info("");
		log.info("* * * * * * * * * * FINDALL * * * * * * * * * *");
		pizzaService.findAll().forEach(pizza -> log.info(pizza.toString()));
		log.info("");
	}

}
