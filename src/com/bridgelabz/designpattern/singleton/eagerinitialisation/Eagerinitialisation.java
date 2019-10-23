package com.bridgelabz.designpattern.singleton.eagerinitialisation;

public class Eagerinitialisation {
	
	private	Eagerinitialisation(){}
			
	private static Eagerinitialisation  eagerinitialisation=new  Eagerinitialisation();	
		
	public static Eagerinitialisation getEagerinitialisationInstance() {
		return eagerinitialisation;
	}

}
