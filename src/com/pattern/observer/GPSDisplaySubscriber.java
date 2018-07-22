package com.pattern.observer;

public class GPSDisplaySubscriber implements Observer{

	private Subject subject;
	
	public GPSDisplaySubscriber(Subject subject){
		this.subject=subject;
	}
	@Override
	public void update() {
		String msg = (String) subject.getUpdate(this);
		if(msg == null){
			System.out.println(msg+":: No new message");
		}else
		System.out.println(msg+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.subject=sub;
	}

}
