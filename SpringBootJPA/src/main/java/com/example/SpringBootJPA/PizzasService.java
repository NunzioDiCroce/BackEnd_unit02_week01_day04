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

	public Pizza findById(int _id) throws ItemNotFoundException {
		return iPizzasRepository.findById(_id).orElseThrow(() -> new ItemNotFoundException(_id));

	}

	public void findByIdAndUpdate(int _id, Pizza _pizza) throws ItemNotFoundException {
		Pizza desired = this.findById(_id);

		desired.setId(_id);
		desired.setName(_pizza.getName());
		desired.setFirstTopping(_pizza.getFirstTopping());
		desired.setSecondTopping(_pizza.getSecondTopping());
		desired.setThirdTopping(_pizza.getThirdTopping());
		desired.setFourthTopping(_pizza.getFourthTopping());
		desired.setCalories(_pizza.getCalories());
		desired.setPrice(_pizza.getPrice());
		desired.setPizzaSize(_pizza.getPizzaSize());

		iPizzasRepository.save(desired);

	}

	public void findByIdAndDelete(int _id) {
		Pizza desired = this.findById(_id);
		iPizzasRepository.delete(desired);
		log.info(desired.getName() + " con ID " + desired.getId() + " cancellata con successo");
	}

	public long count() {
		return iPizzasRepository.count();

	}

}
