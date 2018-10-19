package com.pattern.adapter;

public class GermanToUKPlugConnectorAdapter implements UKElectricalSocket {

	private GermanElectricalSocket plug;

	public GermanToUKPlugConnectorAdapter(GermanElectricalSocket plug) {
	        this.plug = plug;
	    }

	@Override
	public void giveElectricity() {
		plug.giveElectricity();
		
	}

}
