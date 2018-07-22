package com.pattern.decorator;

public class SoyDecorator extends AddonDecorator{
	
	Beverage beverage;
	
	public SoyDecorator(Beverage beverage) {
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
