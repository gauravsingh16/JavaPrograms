package com.bridgelabz.functional;

public class Factor {
	public static void primeFactors(int number) {
		while (number % 2 == 0) {
			System.out.print(2 + " ");
			number /= 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {

			while (number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}
		}

		if (number > 2)
			System.out.print(number);
	}

	public static void main(String[] args) {
		int number = 10;
		primeFactors(number);
	}

}
