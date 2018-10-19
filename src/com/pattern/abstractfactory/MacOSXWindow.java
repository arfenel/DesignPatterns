package com.pattern.abstractfactory;

//ConcreteProductA2
public class MacOSXWindow implements Window {
	public void setTitle() {
		// Mac OSX specific behaviour
	}

	public void repaint() {
		// Mac OSX specific behaviour
	}

	@Override
	public void setTitle(String text) {
		// TODO Auto-generated method stub

	}
}
