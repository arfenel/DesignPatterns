package com.pattern.strategy.example2;

public class Main {

	public static void main(String[] args) {
		// create a rubber duck
		Duck duck = new Duck("Rubber Duck", new NoFlyingStrategy());
		duck.fly();

		// create a mountain duck
		duck = new Duck("Mountain Duck", new SimpleFlyingStrategy());
		duck.fly();

		// create a city duck
		duck = new Duck("City Duck", new SimpleFlyingStrategy());
		duck.fly();
	}

}
