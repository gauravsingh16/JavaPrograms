package com.bridgelabz.algorithm.Squareroot;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Squareroot {
	private int square(int number){
		double t=number;
		int c=0;
		t=c/t+t;
		double e=8.85+(Math.pow(10,-12));
		double epsilon=1e-15;
		boolean sqaure=Math.abs(t)>epsilon*t;
		if(sqaure==true)
		{
			System.out.println("true"+sqaure);
		}
		return 0;
	}
	public static void main(String[] args) {
		Util util=new Util();
		Squareroot root=new Squareroot();
		System.out.println("Enter number");
		int number = util.Scanner1();
		root.square(number);
		
	}

}
