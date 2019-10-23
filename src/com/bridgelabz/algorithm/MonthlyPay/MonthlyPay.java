package com.bridgelabz.algorithm.MonthlyPay;

import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class MonthlyPay {
	public  int monthlypay(int principal, double rate, int year) {
		int n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (double) (principal * r / 1 - (Math.pow(1 + r, -n)));
		System.out.println(payment);
		return 0;

	}

	public static void main(String[] args) {
		Util util=new Util();
		MonthlyPay monthly=new MonthlyPay();
		System.out.println("Enter the principal amount");
		int principal=util.Scanner1();
		System.out.println("Enter the rate");
		double rate=util.Scanner4();
		System.out.println("Enter the years");
		int year=util.Scanner1();
		System.out.println("Monthly payment to reach the principal amount is "+monthly.monthlypay(principal,rate,year));
		;
	}

}
