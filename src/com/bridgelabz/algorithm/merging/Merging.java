package com.bridgelabz.algorithm.merging;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Merging {
	private static int[] arr;
	private static int[] temparr;
	private static int length;

	public  void mergesort(int[] arr, int lowerindex, int higherindex) {
		int length = arr.length;

		if (lowerindex < higherindex) {
			int middle = lowerindex + (higherindex - lowerindex) / 2;

			mergesort(arr, lowerindex, middle);
			mergesort(arr, middle+1, higherindex);
			merging(lowerindex, middle, higherindex);
		}

	}

	public  int merging(int lowerindex, int middle, int higherindex) {
		int[] temparr = new int[length];
		for (int i = lowerindex; i <= higherindex; i++) {
			temparr[i] = arr[i];
		}
		int lower = lowerindex;
		int mid = middle + 1;
		int higher = higherindex;
		while (lower <= middle && mid <= higherindex) {
			if (temparr[lower] <= temparr[mid]) {
				arr[higher] = temparr[lower];
				lower++;
			} else {
				arr[higher] = temparr[mid];
				mid++;
			}
			higher++;
		}
		while (lower <= mid) {
			arr[higher] = temparr[lower];
			higher++;
			lower++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Util util=new Util();
		Merging merger=new Merging();
		int[] arr1 = new int[5];
		System.out.println("Enter no of elements in array");
		int numberofelements = util.Scanner1();
		System.out.println("Enter elements in array");
		for (int i = 1; i <= numberofelements; i++) {
			arr1[i] = util.Scanner1();
		}

		merger.mergesort(arr1, 0, arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
