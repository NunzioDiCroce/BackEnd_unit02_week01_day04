package com.example.SpringBootJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "pizzas")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j

public class Pizza {

	@Id
	@GeneratedValue
	private int id;

	protected String name;
	protected String firstTopping;
	protected String secondTopping;
	protected String thirdTopping;
	protected String fourthTopping;
	protected double calories;
	protected double price;

	@Enumerated(EnumType.STRING)
	protected PizzaSize pizzaSize;

	public Pizza(String _name, String _firstTopping, String _secondTopping, double _calories, double _price) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.calories = _calories;
		this.price = _price;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping, double _calories,
			double _price) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.thirdTopping = _thirdTopping;
		this.calories = _calories;
		this.price = _price;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping, String _fourthTopping,
			double _calories, double _price) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.thirdTopping = _thirdTopping;
		this.fourthTopping = _fourthTopping;
		this.calories = _calories;
		this.price = _price;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, double _calories, double _price,
			PizzaSize _pizzaSize) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.calories = _calories;
		this.price = _price;
		this.pizzaSize = _pizzaSize;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping, double _calories,
			double _price, PizzaSize _pizzaSize) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.thirdTopping = _thirdTopping;
		this.calories = _calories;
		this.price = _price;
		this.pizzaSize = _pizzaSize;
	}

}
