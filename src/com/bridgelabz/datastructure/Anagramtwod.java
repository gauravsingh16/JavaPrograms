package com.bridgelabz.datastructure;

import java.util.Arrays;

public class Anagramtwod {

	public boolean prime(int a){
		 int count=0;
		 int num=0;
		 int i;
		for( i=1;i<=a;i++)
		{
			if(a%i==0){
				
				count=count+1;
				}
		}
		if(count==2){
			return true;
			
		}
		return false;
	}

	public int[] arrayprime(int a)
	{
	 int[] arr=new int[1000];
		int num=0;
		
		for( int k=0;k<=a;k++)
		{
					if(prime(num)){
						arr[k]=num;
						System.out.print(arr[k]+",");
						
					}num++;
					
				}System.out.println("\n");
	
				return arr;
	}
		public  int[] set()
		{	int a=1000;
			int[]arr2=new int[999];
			int[] arr1=arrayprime(a);
			{
				for(int i=0;i<arr1.length;i++)
				{
					if(arr1[i]>0)
					{
						arr2[i]=arr1[i];
						System.out.print(arr2[i]+" ");
					}
				}System.out.println("\n");
			return arr1;}	
		}

	public  int reverse(int num)
	{
		int rev=0;
		
			while(num!=0)
				{
					int digit=num%10;
					rev=rev*10+digit;
					num/=10;
			}
				
			return rev;}
	
				
				
				
	/*
	public static int[] anagramcheck()
	{ int count=0,a=1000;
		int []arr3=arrayprime(a);
		int arr2=reverse(a);
	
		
	for(int i=0;i<arr2.length;i++){
		{for(int j=0;j<arr3.length;j++)
			if(arr2[i]>=arr3[j]){
				count++;
				
			}
		}
	}return arr2;
	}*/
	public  int[][] twod(int[]arr)
	{
		int array1[][]=new int[10][100];
		int count=0;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<99;j++)
			{
				 if(count==arr.length) 
				 { break;}else
				 array1[i][j]=arr[count];
				 if(array1[i][j]>0)
			     System.out.print(array1[i][j]+" ");
			     count++; 
			   }
			   System.out.println("\n");
			        }return array1;

	}
	public  void compare(int[][]arr1,int[][] arr2)
	{	System.out.println("For non anagrams");
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<99;j++)
			{	
				if(arr1[i][j]>0 && arr2[i][j]>0)
				
				{if (arr1[i][j]==arr2[i][j])
				{
					
					System.out.print(" "+arr2[i][j]);
				}
			}
		}System.out.print("\n");
		}
		
	}
	public  void compare1(int[][]arr1,int[][] arr2)
	{	System.out.println("For anagrams");
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<99;j++)
			{	
				if(arr1[i][j]>0 && arr2[i][j]>0)
				
				{if (arr1[i][j]!=arr2[i][j])
				{
					
					System.out.print(" "+arr2[i][j]);
				}
			}
				}System.out.print("\n");
			}
		}
	public static void main(String[] args) {
		Anagramtwod twod=new Anagramtwod();
	int[]arr3=twod.set();
	int[]arr1=new int[998];
	for(int i=0;i<=arr1.length;i++){	
		int value=twod.reverse(arr3[i]);
		
			if(value>0)
		{
			 arr1[i]=value;
			 System.out.print(arr1[i]+" ");
		}
			}System.out.println("/n");
			System.out.println("reverse 2d");
				int[][]array1=twod.twod(arr1);
				System.out.println("Prime 2D");
			int[][]array2=twod.twod(arr3);
		twod.compare(array1,array2);
		twod.compare1(array1,array2);
		//System.out.println("Not Anagram "+compare(array1,array2));
	
	}}
	