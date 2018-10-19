package com.pattern.adapter;

public class Main {

	public static void main(String args[]) {
		GermanPlugConnector germanPlugConnector = new GermanPlugConnector();
		germanPlugConnector.giveElectricity();
		
		UKElectricalSocket germanAdapter = new GermanToUKPlugConnectorAdapter(germanPlugConnector);
		germanAdapter.giveElectricity();
		
		
	}
}
