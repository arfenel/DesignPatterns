package com.pattern.abstractfactory;

public class Main {
	public static void main(String[] args) {
		System.out.println("Main");
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		// check what platform we're on
		if (args[0].equals("MACOSX")) {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
}
