package com.bridgelabz.designpattern.observer;

public class OctalObserver extends Observer{
	public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	

	@Override
	public void update() {
		System.out.println("Integer Octal value as"+Integer.toOctalString( subject.getState() ));
		
	}
}
