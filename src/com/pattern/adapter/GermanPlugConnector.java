package com.pattern.adapter;

public class GermanPlugConnector implements GermanElectricalSocket {

	@Override
	public void giveElectricity() {
		System.out.println("GermanPlugConnector giveElectricity");

	}

}
