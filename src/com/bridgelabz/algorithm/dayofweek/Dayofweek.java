package com.bridgelabz.algorithm.dayofweek;


import com.bridgelabz.Utility.*;

public class Dayofweek {
	public int dayofweek(int date,int month,int year){
		
		//to find day of the date
				 year = year-(14 - month) / 12;
				int x = year + year/4 - year/100 + year/400;
				 month = month + 12 * ((14 - month)/12) - 2;
				 date = (date + x + 31 * month / 12) % 7;
				
				System.out.println("Day is "+date);
				String day;		
				switch(date){
				case 0:
					day="Sunday";
					break;
				case 1:
					day="Monday";
					break;
				case 2:
					day="Tuesday";
					break;
				case 3:
					day="Wednesday";
					break;
				case 4:
					day="Thrusday";
					break;
				case 5:
					day="Friday";
					break;
				case 6:
					day="Saturday";
					break;
				default:
					day="Invalid";
						break;
			} System.out.println(day);

			return date;	
	}

	public static void main(String[] args) {
		Util util=new Util();
		Dayofweek dayofweek=new Dayofweek();
		System.out.println("Write date in dd-m-yyyy format");
		System.out.print("Write date");
		int date=util.Scanner1();
		System.out.print("Write month");
		int month=util.Scanner1();
		System.out.print("Write year");
		int year=util.Scanner1();
		
		
		dayofweek.dayofweek(date,month,year);
		
		
			}}
