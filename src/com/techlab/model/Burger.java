package com.techlab.model;

public abstract class Burger implements Item {
	@Override
	public Packing itemPacking() {
		return new ItemWrapper();
	}

	@Override
	public abstract float itemPrice();
}
