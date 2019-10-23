package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Harmonicno {
	static double nthHarmonic(int number) {

		float harmonic = 1;

		for (int i = 2; i <= number; i++) {
			harmonic += (float) 1 / i;
		}

		return harmonic;
	}

	public static void main(String[] args) {
		Util util=new Util();
		int number=util.Scanner1();
		System.out.print(nthHarmonic(number));

	}
}
