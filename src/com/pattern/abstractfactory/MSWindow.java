package com.pattern.abstractfactory;

//ConcreteProductA1
public class MSWindow implements Window {
	public void setTitle() {
		// MS Windows specific behaviour
	}

	public void repaint() {
		// MS Windows specific behaviour
	}

	@Override
	public void setTitle(String text) {
		// TODO Auto-generated method stub

	}
}
