package com.example.SpringBootJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PizzasService {

	@Autowired
	private IPizzasRepository iPizzasRepository;

	public void save(Pizza _pizza) {
		iPizzasRepository.save(_pizza);
		log.info(_pizza.getName() + " con ID " + _pizza.getId() + " salvata con successo");
	}

	public List<Pizza> findAll() {
		return iPizzasRepository.findAll();

	}

	public Optional<Pizza> findById(int _id) {
		return iPizzasRepository.findById(_id);

	}

	public void findByIdAndUpdate(int _id, Pizza _pizza) {
		Pizza desired = this.findById(_id);
		
		desired.
		
//		private int id;

//		protected String name;
//		protected String firstTopping;
//		protected String secondTopping;
//		protected String thirdTopping;
//		protected String fourthTopping;
//		protected double calories;
//		protected double price;
//
//		@Enumerated(EnumType.STRING)
//		protected PizzaSize pizzaSize;
	}

}
