package com.bridgelabz.designpattern.computerfactory.main;

import com.bridgelabz.designpattern.computerfactory.abstractclass.Computer;
import com.bridgelabz.designpattern.util.Utility;

public class User {

	public static void main(String[] args) {
		System.out.println("enter ram");
		String ram=Utility.getString();
		System.out.println("enter hdd");
		String hdd=Utility.getString();
		System.out.println("enter cpu");
		String cpu=	Utility.getString();
		
		


		Computer computer = ComputerFactory.getComputer("Laptop",ram,hdd,cpu);

System.out.println(computer);


	}

}
