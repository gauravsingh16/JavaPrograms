package com.bridgelabz.designpattern.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.bridgelabz.designpattern.singleton.eagerinitialisation.Eagerinitialisation;

public class Reflection {

	public static void main(String[] args) {
		Eagerinitialisation instanceone = Eagerinitialisation.getEagerinitialisationInstance();
		
		Eagerinitialisation instancetwo=null;
		
		Constructor[] constructors=Eagerinitialisation.class.getDeclaredConstructors();
		for(Constructor constructor:constructors) {
			constructor.setAccessible(true);
			try {
				instancetwo=(Eagerinitialisation) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("instance one  "+instanceone);
		System.out.println("instance two "+instancetwo);
		

	}

}
