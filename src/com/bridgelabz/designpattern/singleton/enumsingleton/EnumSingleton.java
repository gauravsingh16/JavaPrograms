package com.bridgelabz.designpattern.singleton.enumsingleton;

public class EnumSingleton {
	 private EnumSingleton() {
		   
	   }
	public static void main(String[] args) {
  
   EnumSingleton enumSingleton=new EnumSingleton();
   Singleton singleton=Singleton.INSTANCE;
	System.out.println(singleton.getInstance());
   singleton.setInstance(enumSingleton);
   
   System.out.println(singleton.getInstance());
}}
