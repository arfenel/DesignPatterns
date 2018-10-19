package com.pattern.strategy.example2;

/*
 * Problem 1:  Rubber duck does not fly
 * Problem 2:  City and mountain duck has the same implementation of fly
 */
public class Duck {
	
	private IFlyStrategy iFlyStrategy;
	private String duckType;
	
	public Duck(String duckType, IFlyStrategy iFlyStrategy) {
		this.duckType = duckType;
		this.iFlyStrategy = iFlyStrategy;
	}
	
	public void fly() {
		System.out.println(this.duckType + " flies like " + this.iFlyStrategy.fly());
	}

}
