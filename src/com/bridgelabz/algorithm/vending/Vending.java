package com.bridgelabz.algorithm.vending;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Vending {

	private  int vending(int change){
		int[]notes={1000,500,100,50,10,5,2,1};
		int[] count=new int[8];
		for(int i=0;i<8;i++)
		{
			if(change>=notes[i])
			{
				count[i]=change/notes[i];
				change=change-count[i]*notes[i];
			}
		}
		System.out.println("Notes counting");
		for(int i=0;i<8;i++)
		{
			if(count[i]!=0)
			{
				
				System.out.println(notes[i]+ " " +count[i] );
				
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Util util=new Util();
		Vending vending = new Vending();
		System.out.println("Enter the changed amount");
		int change=util.Scanner1();
		vending.vending(change);
	}

}
