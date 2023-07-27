package com.example.SpringBootJPA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@PropertySource("classpath:application.properties")

public class BeansConfiguration {

	@Bean(name = "MargheritaPizza")
	public Pizza getMargheritaPizza() {
		return new Pizza("Margherita Pizza", "tomato", "cheese", 1104, 4.99);
	}

	@Bean(name = "HawaiianPizza")
	public Pizza getHawaiianPizza() {
		return new Pizza("Hawaiian Pizza", "tomato", "cheese", "ham", "pineapple", 1024, 6.49);
	}

	@Bean(name = "SalamiPizza")
	public Pizza getSalamiPiazza() {
		return new Pizza("Salami Pizza", "tomato", "cheese", "salami", 1160, 5.99);
	}

}
