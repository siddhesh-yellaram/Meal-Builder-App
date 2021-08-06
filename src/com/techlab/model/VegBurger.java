package com.techlab.model;

public class VegBurger extends Burger{

	@Override
	public String itemName() {
		return "Veg Burger";
	}

	@Override
	public float itemPrice() {
		return 75.05f;
	}
	
}
