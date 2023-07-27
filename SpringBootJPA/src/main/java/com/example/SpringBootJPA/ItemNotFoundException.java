package com.example.SpringBootJPA;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(int _id) {
		super("Item with ID " + _id + " not found!");
	}
}
