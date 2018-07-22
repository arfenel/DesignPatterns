package com.pattern.observer;

public class ObserverPatternTest {
	
	public static void main(String[] args) {
		//create subject
		WeatherStation topic = new WeatherStation();
		
		//create observers
		Observer obj1 = new PhoneDisplaySubscriber(topic);
		Observer obj2 = new GPSDisplaySubscriber(topic);
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		
		//now send message to subject
		topic.postMessage("New Message");
	}


}
