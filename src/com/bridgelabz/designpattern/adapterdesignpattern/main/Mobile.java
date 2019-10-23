package com.bridgelabz.designpattern.adapterdesignpattern.main;

import com.bridgelabz.designpattern.adapterdesignpattern.interfaces.SocketClassAdapterImpl;

public class Mobile {
	public static void main(String[] args) {
	SocketClassAdapterImpl socketClassAdapterImpl=new SocketClassAdapterImpl();
	Volt v=socketClassAdapterImpl.get3Volt();
	System.out.println("By suing class Implementation we get mobile charge"+v.getVolts());
	
	
	
}}
