package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.itemPrice();
		}
		return cost;
	}

	public void showItems() {

		for (Item item : items) {
			System.out.print("Item : " + item.itemName());
			System.out.print(", Packing : " + item.itemPacking().pack());
			System.out.println(", Price : " + item.itemPrice());
		}
	}
}
