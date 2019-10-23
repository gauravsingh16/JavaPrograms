package com.bridgelabz.algorithm.SortingandSearching;
import com.bridgelabz.Utility.*;
public class SortingandSearching {

	public static void main(String[] args) {
		Util util=new Util();
		int i=0;
		long[]a=new long[6];
		//binary search for integer
		long strttime=System.nanoTime();
		int[]arr1=new int[5];
		System.out.println("Enter array elements");	
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=util.Scanner1();
		}
		System.out.println("Enter element to find");
		int find=util.Scanner1();
		int result=util.binarysearch(arr1,find);
		if(result==-1)
		{
			System.out.println("Element not present");
		}else
			System.out.println("Element found at "+"index"+result);
		long endtime=System.nanoTime();
		long elapsed=endtime-strttime;
		a[0]=elapsed/1000;
		
		//binary search of string
		long strtttime=System.nanoTime();
		String[]arr2=new String[5];
		System.out.println("Enter Strings");
		for(i=0;i<arr1.length;i++)
		{
			arr2[i]=util.Scanner6();
		}
		System.out.println("Enter string to find");
		String finnd=util.Scanner6();
		util.binarysearch(arr2,finnd);
		long endttime=System.nanoTime();
		long elappsed=endttime-strtttime;
		a[0]=elappsed;
		
		//bubble sort for integer
		long strttttime=System.nanoTime();
		int[]arr3=new int[5];
		System.out.println("Enter elements");
		for(i=0;i<arr3.length;i++)
		{
			arr3[i]=util.Scanner1();
		}
		util.bubblesort(arr3);
		for(i=0;i<arr3.length;i++)
		{System.out.print("sorted array is "+arr3[i]);
		}
		long endtttime=System.nanoTime();
		long elapppsed=endtttime-strttttime;
		a[0]=elapppsed;
			
		//bubble sort for string
		
		long strtttttime=System.nanoTime();	
		String[]arr4=new String[5];
		System.out.println("Enter strings");
			for(i=0;i<arr4.length;i++)
		{
			arr4[i]=util.Scanner6();
		}
			util.bubblesort(arr4);
			for(i=0;i<arr4.length;i++)
			{
				System.out.println("Sorted strings are"+arr4[i]);
			}
			long endttttime=System.nanoTime();
		long elappppsed=endttttime-strtttttime;
		a[0]=elappppsed;
		// insertion sort for integer
		long strttttttime=System.nanoTime();
		
		int[]arr5=new int[5];
		System.out.println("Enter elements");
		for(i=0;i<arr5.length;i++)
		{
			arr5[i]=util.Scanner1();
		}
		util.insertionsort(arr5);
		for(i=0;i<arr5.length;i++)
		{
			System.out.println("Sorted array is "+arr5[i]);
		}
		long endtttttime=System.nanoTime();
		long elapppppsed=endtttttime-strttttttime;
		a[5]=elapppppsed;
		// insertion sort for string
		long strtttttttime=System.nanoTime();
		String[]arr6=new String[5];
		System.out.println("Enter elements");
		for(i=0;i<arr6.length;i++)
		{
			arr6[i]=util.Scanner6();
		}
		util.insertionsort(arr6);
		for(i=0;i<arr6.length;i++)
		{
			System.out.println("Sorted array is "+arr6[i]);
		}
		long endttttttime=System.nanoTime();
		long elappppppsed=endttttttime-strtttttttime;
		a[6]=elappppppsed;
		
}

}
