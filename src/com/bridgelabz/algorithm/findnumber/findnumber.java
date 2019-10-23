package com.bridgelabz.algorithm.findnumber;

import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class findnumber {

	public static void main(String[] args) {
		Util util=new Util();
		findnumber find=new findnumber();
		int[]arr={};
		System.out.println("Enter No");
		int N=util.Scanner1();
		System.out.println("Enter no to search");
		int key=util.Scanner1();
		
		for(int i=0;i<=N;i++)
		{	
			if(N==Math.pow(2, i))
			{	
				
			for( i=0;i<=N;i++)
				{
					arr=new int[i];
					
					
				}
			}		
		}find.binarysearch(arr,key);
		}
		
public int binarysearch(int[]arr,int key){
	Util util=new Util();
	int start=0;
	int end=arr.length;
	while(start<=end)
	{
		int mid=(start+end)/2;
		System.out.println("Intermidiate "+mid);
				
		 if (key<arr[mid])
		{
					end=mid-1;
					System.out.println("Press True if No is between "+start+ " to mid value"+end);
					String ch=util.Scanner6();
					break;
		}
		else if (key>arr[mid])
		{
			start=mid+1;
			
			System.out.println("Press False if No is between "+start+" to end value "+end);
			String ch=util.Scanner6();
			break;
		}	
		else{
			System.out.println("False");
			}
		}
	return 0;
	}		
}

