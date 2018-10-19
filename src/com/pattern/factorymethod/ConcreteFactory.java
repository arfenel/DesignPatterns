package com.pattern.factorymethod;

public class ConcreteFactory extends Creator{

	@Override
	 public int shippingCharge() {
        // TODO Auto-generated method stub
        return 1000;
    }
    @Override
    public void createTV() {
        new IProduct() {
            @Override
            public void createTV() {
                System.out.println("LED TV");
            }
        }.createTV();
    }
    public static void main(String[] args) {
    	Creator factory = new ConcreteFactory();
        factory.orderTV();
    }

}
