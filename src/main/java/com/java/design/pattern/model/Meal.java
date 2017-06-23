package com.java.design.pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> itemList = new ArrayList<Item>();

	public void addItem(Item item) {
		itemList.add(item);
	}

	public float getTotalAmount() {
		float cost = 0.0f;

		for (Item item : itemList) {
			cost += item.itemPrice();
		}
		return cost;
	}

	public void displayItems() {

		for (Item item : itemList) {
			System.out.print("Item : " + item.itemName());
			System.out.print(", Packing : " + item.packing().Pack());
			System.out.println(", Price : " + item.itemPrice());
		}
	}

}
