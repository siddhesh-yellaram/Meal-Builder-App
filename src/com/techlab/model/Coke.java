package com.techlab.model;

public class Coke extends ColdDrink{

	@Override
	public String itemName() {
		return "Coke";
	}

	@Override
	public float itemPrice() {
		return 40.5f;
	}
	
}
