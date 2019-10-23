package com.bridgelabz.functional;

import java.util.Scanner;
import java.util.logging.Logger;

import com.bridgelabz.Utility.*;
public class Stopwatch {

	public static void elapsedtime(double start, double end) {
		double elapsed = end - start;
		System.out.println("elapsed time is" + elapsed);
	}

	public static void main(String[] args) {
		Util util=new Util();
		Logger.getLogger("Start time is");
		double start = util.Scanner4();
		Logger.getLogger("End time is");
		double end = util.Scanner4();
		elapsedtime(start, end);

		
	}

}
