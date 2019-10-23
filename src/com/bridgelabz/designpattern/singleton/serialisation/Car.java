package com.bridgelabz.designpattern.singleton.serialisation;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Car() {
		
	}
private static Car car=null;
public static Car getinstance() {
	if(car==null) {

car=new Car();		
	}
	return car;		
}
 	
	
}
