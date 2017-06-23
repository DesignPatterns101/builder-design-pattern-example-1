package com.java.design.pattern.model;

public class MealBuilder {
	public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegMomos());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenMomos());
	      meal.addItem(new Pepsi());
	      return meal;
	   }

}
