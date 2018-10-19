package com.pattern.command;

public class Main {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		ICommand lightsOn = new LightOffCommand(light);
		ICommand lightsOff = new LightOnCommand(light);
		// switch on
		control.setCommand(lightsOn);
		control.pressButton();
		// switch off
		control.setCommand(lightsOff);
		control.pressButton();
	}
}
