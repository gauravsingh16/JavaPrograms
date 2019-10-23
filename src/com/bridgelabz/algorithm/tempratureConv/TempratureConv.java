package com.bridgelabz.algorithm.tempratureConv;

import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class TempratureConv {

	public  double tempratureconv(double type,double temprature){
		double celcius=0;
		double farhenite=0;
		if(temprature<=0 && temprature<=100)
		{
			temprature=celcius;
		}
		else	temprature=farhenite;
	
		if(temprature==celcius)
		{
			farhenite=(celcius * 9/5) + 32;
			System.out.println("Temp is"+farhenite);
			return 1;
		}else{
			celcius=(farhenite -32) * 5/9; 
			System.out.println("Temp is"+celcius);
			return 1;
		}
		
		
	}
	public static void main(String[] args) {
		Util util=new Util();
		TempratureConv temprature=new TempratureConv();
		System.out.println("Enter the type of temprature");
		double type=util.Scanner4();
		System.out.println("Enter temprature");
		double temprature1=util.Scanner4();
		temprature.tempratureconv(type, temprature1);
		System.out.println("Temprature now is"+temprature.tempratureconv(type,temprature1));
	
	}

}
