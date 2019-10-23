package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class Palindromecheck {
	private char word;
	public Palindromecheck(char word1)
	{
		this.word=word1;
	}
	static class Dequeue{
		char[]word;
		int size;
		int total;
		int front;
		int rear;
		public Dequeue()
		{
			size=100;
			total=0;
			front=0;
			rear=0;
			word=new char[size];
		}
			public void enque1(char charAt) {
			if(isfull())
			{System.out.println("Queue full");}
		else
			total++;
		word[rear]=charAt;
		rear=(rear+1)%size;
		
		System.out.println("index"+rear);
		rear++;
		}
		public boolean isfull()
		{
			if(size==total)
				return true;
			return false;
		}
		public char dequeuefront()
		{
			char word1=word[front];
			total--;
			front=(front+1)%size;
			return word1;
		}
		public char dequeuerear()
		{
			char word2=word[rear];
			total--;
			rear=(rear+1)%size;
			return word2;
		}
		
		public void show()
		{
			int f=front;
			if(total!=0)
			{
				for(int i=0;i<total;i++)
				{
					System.out.println("lefted \t"+word[f]);
					f=(f+1)%size;
				}
			}
			}
	public static void main(String[] args) {
		Dequeue q=new Dequeue();
		Util util=new Util();
		System.out.println("Enter String to check");
		String str=util.Scanner6();
		char[]arr=new char[10];
		arr=str.toCharArray();
		int length=arr.length;
	for (int i=0;i<length/2;i++)
	{
		if(arr[i]==arr[length-i])
		{
			q.enque1(arr[i]++);
			System.out.println("Palindrome");
			
		}else 
			q.dequeuefront();
			System.out.println("Not Palindrome");
			break;
	}q.show();
	}

}
	}
