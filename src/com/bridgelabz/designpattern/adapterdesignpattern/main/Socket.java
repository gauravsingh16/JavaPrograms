package com.bridgelabz.designpattern.adapterdesignpattern.main;

public class Socket {
	
	public Volt getVolt(){
		return new Volt(120);
	}
}
