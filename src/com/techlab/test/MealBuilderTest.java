package com.techlab.test;

import com.techlab.model.Meal;
import com.techlab.model.MealBuilder;

public class MealBuilderTest {

	public static void main(String[] args) {
		MealBuilder makeMeal = new MealBuilder();

		Meal vegMeal = makeMeal.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = makeMeal.prepareNonVegMeal();
		System.out.println("\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
