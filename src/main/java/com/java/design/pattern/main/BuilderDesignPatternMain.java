package com.java.design.pattern.main;
/*Builder pattern is a creational design pattern.
 *The Builder pattern can be used to ease the construction of a complex object from simple objects.
*/
import com.java.design.pattern.model.Meal;
import com.java.design.pattern.model.MealBuilder;

public class BuilderDesignPatternMain {
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.displayItems();
		System.out.println("Total cost:"+vegMeal.getTotalAmount());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg meal");
		nonVegMeal.displayItems();
		System.out.println("Total cost:"+nonVegMeal.getTotalAmount());
	}
	
    
	

}
