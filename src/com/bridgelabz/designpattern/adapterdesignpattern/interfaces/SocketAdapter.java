package com.bridgelabz.designpattern.adapterdesignpattern.interfaces;

import com.bridgelabz.designpattern.adapterdesignpattern.main.Volt;

public interface SocketAdapter {
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();
}
