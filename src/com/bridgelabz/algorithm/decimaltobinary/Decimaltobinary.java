package com.bridgelabz.algorithm.decimaltobinary;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Decimaltobinary {
	public String decimaltobinary(int number) {
		String binary="";
		String s1="";
		String s2="";
		int middle=0;
		while(number>0){
		binary=number%2+binary;
		number=number/2;
		
		}
	while(binary.length()%4!=0){
		binary=0+binary;
	}
	for(int i=0;i<=binary.length();i++)
	{System.out.println(binary);
	}	
	
	s1=binary.substring(0,3);
	s2=binary.substring(4,7);
	
	String temp="";
	temp=s1;
	s1=s2;
	s2=temp;
	
	String s3=s1.concat(s2);
	
	for(int j=0;j<=s3.length();j++)
	{
		System.out.println("swapped binary no is "+s3);
	}
		return binary;
	}

	public static void main(String[] args) {
		Util util=new Util();
		Decimaltobinary binary=new Decimaltobinary();
		System.out.println("Enter decimal no");
		int number = util.Scanner1();
		
		binary.decimaltobinary(number);
		
	}

}
