package com.bridgelabz.Utility;

import java.util.Scanner;

public class Util {
	static Scanner scan=new Scanner(System.in);
	public  static int Scanner1(){
		//System.out.println("Enter Number");
		int number=scan.nextInt();
		return number;
	}public static short Scanner2(){
		System.out.println("Enter Number");
		short number=scan.nextShort();
		return number;
	}public  static long Scanner3(){
		System.out.println("Enter Number");
		long number=scan.nextLong();
		return number;
	}public  static double Scanner4(){
		System.out.println("Enter Number");
		double number=scan.nextDouble();
		return number;
	}public  static boolean Scanner5(){
		
		boolean number=scan.hasNext();
		return number;
	}public  static String Scanner6(){
		
		String number=scan.next();
		return number;
	}

public static String insertionsort(String[]arr1)
{
	int n=arr1.length;
	for(int j=1;j<n;j++)
	{
		String key=arr1[j];
		int i=j-1;
		while(i>=0){
			if(key.compareTo(arr1[i])>=0){
				break;
			}arr1[i+1]=arr1[i];
			i--;
		}arr1[i+1]=key;
	}
	return null;
}

public static int insertionsort(int[]arr1){
	int n=arr1.length;
	for(int j=1;j<n;j++)
	{
		int key=arr1[j];
		int i=j-1;
		while((i>-1)&&(arr1[i]>key))
		{
			arr1[i+1]=arr1[i];
			i--;
		}	arr1[i+1]=key;
		
		}
	return -1;	}

	
public static String bubblesort(String[]arr1){
	int n=arr1.length;
	String temp;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr1[j].compareTo(arr1[i])<0){
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
				
			}
		}
	}
	return null;}

public static int bubblesort(int[]arr1){
	int n=arr1.length;
	int temp=0;
	for(int i=0;i<=n;i++)
	{
		for(int j=1;j<n-1;j++)
		{
			if(arr1[j-1]>arr1[j])
			{
				temp=arr1[j-1];
				arr1[j-1]=arr1[j];
				arr1[j]=temp;
			}
		}
			}
	return -1;
}
public static int binarysearch(String[]arr,String s){
	int start=0;
	int end=arr.length-1;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		int res=s.compareTo(arr[mid]); 
		if(s.equals(arr[mid]))
		{	
				if(res==0)
				return mid;	
			 if(res > 0)
				 {start=mid+1;}
				 else
				 {end=mid-1;}	
				}
				}

	return -1;
}

public static int binarysearch(int[]arr,int key){
	
	int start=0;
	int count = 0;
	int end=arr.length-1;
	while(start<=end)
	{
		int mid=(start+end)/2;
		if(key==arr[mid])
		{
			return mid;
			
		}
		else if (key<arr[mid]){
					end=mid-1;
					count=1;
					return end;
					
					
					
		}else
		{
			start=mid+1;
			count=1;
			return start;
			
		}	
	}		
		

		return -1;
			
		}
}