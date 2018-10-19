package com.pattern.factorymethod;

public abstract class Creator {
	
	 public final void orderTV() {
	        createTV();
	        int charge= shippingCharge();
	        System.out.println("Shipping charge :: " + charge + " INR");
	    }
	    protected abstract int shippingCharge();
	    protected abstract void createTV();

}
