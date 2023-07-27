package com.example.SpringBootJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
