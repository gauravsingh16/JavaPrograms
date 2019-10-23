package com.bridgelabz.algorithm.PrimeAndAnagram;

import java.util.Arrays;

public class PrimeAndAnagram {
	public  void anagrams(char[] stra1, char[] stra2) {

		int count = 0;
		int n1 = stra1.length;
		int n2 = stra2.length;
		Arrays.sort(stra1);
		Arrays.sort(stra2);

		for (int i = 0; i < n1; i++) {

			if (stra1[i] == stra2[i]) {
				count = 1;
				break;
			} else {
				count = 0;
				break;
			}
		}
		if (count == 1) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

	public  boolean prime(int a) {
		int count = 0;
		int num = 0;
		int i;
		for (i = 1; i <= a; i++) {
			if (a % i == 0) {

				count = count + 1;

			}

		}
		if (count == 2) {
			return true;

		}
		return false;
	}

	public  void isprime(int a) {
		int i = 0, rev = 0;
		for (i = 1; i <= a; i++) {
			if (prime(i)) {
				System.out.println("Prime nos are " + i);
			}

			int p = i;
			while (p != 0) {
				int digit = p % 10;
				rev = (rev * 10) + digit;
				p /= 10;
			}
			if (i == rev) {
				System.out.println("Palindrome nos are:" + rev);
			}
		}

		/*
		 * for( j=2;j<p;j++) { for(rev=0;rev<=p;rev++) { if(rev==p) {
		 * System.out.println("Anagarams digit"+j); } } }
		 */ }

	public static void main(String[] args) {
		PrimeAndAnagram primeandanagram=new PrimeAndAnagram();
		char str1[] = { 'a', 'b', 'c', 'd' };
		char str2[] = { 'd', 'd', 'b', 'c' };
		primeandanagram.anagrams(str1, str2);
		primeandanagram.isprime(1000);
	}

}
