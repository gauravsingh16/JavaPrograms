package com.bridgelabz.designpattern.observer;

public class HexaObserver extends Observer{
	public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	

	@Override
	public void update() {
		System.out.println("Integer Hexa value as"+Integer.toHexString( subject.getState() ));
		
	}
}
