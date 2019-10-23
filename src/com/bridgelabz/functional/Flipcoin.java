package com.bridgelabz.functional;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Flipcoin {
	public static void main(String[] args) {
		Util util=new Util();
		int flipcoin=util.Scanner1();
		int counter = 0;
		double rand = 0.0;
		int head = 0;
		int tails = 0;
		while (counter <= flipcoin) {
			rand = Math.random();
			if (rand < 0.5) {
				head++;
				System.out.println("heads");
			} else {
				tails++;
				System.out.println("Tails");
			}
			counter++;

		}
		System.out.println();
		System.out.println("number of head" + head);
		System.out.println("Number of tails" + tails);
	}

}
