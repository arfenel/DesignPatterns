package com.pattern.decorator;

public class CaramelDecorator extends AddonDecorator{
	
	Beverage beverage;
	
	public CaramelDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	String getDescription() {
		return null;
	}

	@Override
	double getCost() {
		return beverage.getCost()+100;
	}

}
