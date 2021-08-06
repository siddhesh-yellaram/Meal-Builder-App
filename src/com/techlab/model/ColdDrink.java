package com.techlab.model;

public abstract class ColdDrink implements Item{
	@Override
	public Packing itemPacking() {
		return new Bottle();
	}

	@Override
	public abstract float itemPrice();
}
