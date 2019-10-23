package com.bridgelabz.functional;

public class Distinct {
	public static void main(String[] args) {
		int[] a = { 2, 2, -4 };
		int count = 0;
		int l = a.length;
		for (int i = 0; i <= l - 2; i++) {
			for (int j = i + 1; j <= l - 1; j++) {
				for (int k = j + 1; k <= l; k++) {
					if (a[i] + a[j] + a[k] == 0) {

						System.out.println("Elements are " + a[i] + " " + a[j] + " " + a[k]);
						count++;
						System.out.println("Count" + count);
					} else
						System.out.println("No elements found");
				}
			}
		}
	}
}
