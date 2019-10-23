package com.bridgelabz.designpattern.util;

import java.util.Scanner;

public class Utility {
	static Scanner scanner=new Scanner(System.in);
	
	//To read integer value from the scanner 
public	static int getInt(){
		return scanner.nextInt();
	}
//To read string value from the scanner 
	public static String getString(){
		return scanner.next();
	}
	

}
