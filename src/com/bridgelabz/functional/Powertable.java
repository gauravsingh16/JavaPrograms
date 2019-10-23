package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class Powertable {

	public static void main(String[] args) {
		Util util=new Util();
		int number=util.Scanner1();
		if (number < 31 && number >= 0) {
			for (int i = number; i >= 1; i--) {
				int j = (int) Math.pow(2, i);
				System.out.println("table is " + j);

			}

		}

	

	}

}
