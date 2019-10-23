package com.bridgelabz.designpattern.observer;

public class BinaryObserver extends Observer{
	
	public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	

	@Override
	public void update() {
		System.out.println("Integer Binary value as"+Integer.toBinaryString( subject.getState() ));
		
	}

}
