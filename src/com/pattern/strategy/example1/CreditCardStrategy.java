package com.pattern.strategy.example1;

public class CreditCardStrategy extends Card {

	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		super(nm, ccNum, cvv, expiryDate);
	}

	@Override
	protected String getType() {
		return "credit";
	}

	@Override
	protected void executeTransaction(int cents) {
		// TODO Auto-generated method stub

	}

}
