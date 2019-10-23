package com.bridgelabz.datastructure;

import java.util.Arrays;

public class Primeinarray {

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
/*	public static int[][] reverse()
	{
		int [][]ar=new int[10][1000];
		
	}*/
	public  int[][] arrayprime()
	{
	 int[][] arr=new int[10][1000];
		int num=0;
		
		for( int k=0;k<=9;k++)
		{
			for(int j=0;j<=99;j++)
			{
				{
					if(prime(num)){
						arr[k][j]=num;
						System.out.print((arr[k][j])+",");
						return arr;
					}num++;
				}
			}System.out.println("\n");
		}
		return null;
	}
	
	public  void main(String []args){
		prime(1000);
	
	}
}