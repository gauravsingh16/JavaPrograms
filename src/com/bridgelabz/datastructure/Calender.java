package com.bridgelabz.datastructure;
import java.util.Scanner;

import com.bridgelabz.Utility.*;
import com.bridgelabz.algorithm.*;
import com.bridgelabz.algorithm.dayofweek.Dayofweek;
import com.bridgelabz.functional.*;
public class Calender {
		
	public static void main(String[] args) {
		Util util=new Util();
		System.out.println("Enter month");
		int month = util.Scanner1();
		System.out.println("Enter year");
		int year = util.Scanner1();
		Dayofweek dayofweek=new Dayofweek();
		String[]day={"Su","Mo","Tu","We","Th","Fr","Sa"};
		int[] noofdays={31,28,31,30,31,30,31,31,30,31,30,31};
		String[]months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int day1=dayofweek.dayofweek(1, month, year);
		int startdate=1;
		int lastdate=noofdays[month-1];
		int leap=(int) Leapyear.leapyear(year);
			if(year==leap)
		{
			noofdays[2]=29;
		}
			for(int i=0;i<7;i++)
			{
				System.out.print(day[i]+" ");
				
			}System.out.print("\n");
		for(int i=0;i<startdate;i++)
		{
			System.out.print("   ");
		}
		for(int j=1;j<lastdate;j++)
		{
			System.out.print(String.format("%02d ",j));
			if((startdate+j)%7==0)
				System.out.print("\n");
			
		}
		

	}
	
}
