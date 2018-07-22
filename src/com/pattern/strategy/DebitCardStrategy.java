package com.pattern.strategy;

public class DebitCardStrategy extends Card {

	public DebitCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		super(nm, ccNum, cvv, expiryDate);
	}

	@Override
	protected String getType() {
		return "debit";
	}

	@Override
	protected void executeTransaction(int cents) {
		// TODO Auto-generated method stub

	}

}
