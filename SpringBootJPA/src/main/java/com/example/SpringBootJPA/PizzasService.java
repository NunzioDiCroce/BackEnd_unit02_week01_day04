package com.example.SpringBootJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzasService {

	@Autowired
	private IPizzasRepository iPizzasRepository;

}
