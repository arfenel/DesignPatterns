package com.pattern.decorator;

public class DecoratorPatternTest {
	
	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();
		
		Beverage caramel = new CaramelDecorator(beverage1);
		Beverage soy = new SoyDecorator(caramel);
		
		System.out.println(beverage1.getCost());
		System.out.println(caramel.getCost());
		System.out.println(soy.getCost());
	}

}
