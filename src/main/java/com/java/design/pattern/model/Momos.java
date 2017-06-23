package com.java.design.pattern.model;

public abstract class Momos implements Item {

	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	public abstract float itemPrice();

}
