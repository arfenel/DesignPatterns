package com.pattern.adapter;

public class UKPlugConnector implements UKElectricalSocket {

	@Override
	public void giveElectricity() {
		System.out.println("UKPlugConnector giveElectricity");

	}

}
