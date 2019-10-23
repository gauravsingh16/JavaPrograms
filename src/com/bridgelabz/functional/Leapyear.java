package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class Leapyear {
	public static int leapyear(int yrs) {
		boolean leap = false;
		if (yrs % 4 == 0) {
			if (yrs % 100 == 0) {
				if (yrs % 400 == 0) {
					leap = true;
				} else
					leap = false;

			} else
				leap = true;
		} else
			leap = false;

		if (leap) {
			System.out.println(yrs + " is a leap year");
		} else {
			System.out.println(yrs + " is not a leap year");
		}
		return yrs;

	}

	public static void main(String[] args) {
		Util util=new Util();
		int year=util.Scanner1();
		leapyear(year);
		
	}
}
