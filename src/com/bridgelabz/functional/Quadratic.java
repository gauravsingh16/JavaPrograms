package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.logging.Logger;

import com.bridgelabz.Utility.*;

import java.math.*;

public class Quadratic {
	static double d;

	public static int delta(int a, int b, int c) {
		int delta = b * b - 4 * a * c;
		return delta;
	}

	public static void roots(int a, int b) {

		double root1 = (-b + Math.sqrt(d)) / (2 * a);
		double root2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.println("1st root" + root1);
		System.out.println("2nd root" + root2);
	}

	public static void main(String[] args) {
		Util util=new Util();
		Logger.getLogger("a is");
		int aa = util.Scanner1();
		Logger.getLogger("b is");
		int bb = util.Scanner1();
		Logger.getLogger("c is");
		int cc = util.Scanner1();

		delta(aa, bb, cc);
		roots(aa, bb);
		
	}

}
