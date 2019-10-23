package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.logging.Logger;

import com.bridgelabz.Utility.*;

public class Distance {
	public static void main(String[] args) {
		Util util=new Util();
		Logger.getLogger("Enter no x1");
		double x1=util.Scanner4();
		Logger.getLogger("Enter no y1");
		double y1=util.Scanner4();
		Logger.getLogger("Enter no x2");
		double x2=util.Scanner4();
		Logger.getLogger("Enter no y2");
		double y2=util.Scanner4();

		double xDiff = x1 - x2;
		double xSqr = Math.pow(xDiff, 2);

		double yDiff = y1 - y2;
		double ySqr = Math.pow(yDiff, 2);

		double output = Math.sqrt(xSqr + ySqr);

		System.out.println("Distance = " + output);
		
	}
}
