package com.pattern.decorator;

public class Espresso extends Beverage{

	@Override
	String getDescription() {
		
		return "Espresso";
	}

	@Override
	double getCost() {
		return 1;
	}

}
