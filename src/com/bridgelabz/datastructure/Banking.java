package com.bridgelabz.datastructure;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Banking {
	static class Queue{
		int[]q;
		int size;
		int total;
		int front;
		int rear;
		public Queue()
		{
			size=0;
			total=0;
			front=0;
			rear=0;
			q=new int[size];
		}
		public int enque(int item)
		{
			if(isfull())
				{return 0;}
			else
				total++;
			q[rear]=item;
			rear=(rear+1)%size;
			return 1;
		}
		public boolean isfull()
		{
			if(size==total)
				return true;
			return false;
		}
		public int dequeue()
		{
			int item=q[front];
			total--;
			front=(front+1)%size;
			return item;
		}
		public void show()
		{
			int f=rear;
			if(total!=0)
			{
				for(int i=0;i<total;i++)
				{
					System.out.println("lefted \n"+q[f]);
					f=(f+1)%size;
				}
			}
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		Util util=new Util();
		int[]person=new int[10];
		int i=0;
		System.out.println("Enter no of persons in queue");
		for(i=0;i<=4;i++)
		{person[i]=util.Scanner1();
		q.enque(person[i]);}
		System.out.println("Enter total cash in bank");
		int totalcash=util.Scanner1();
		
		
		int withraw=0;
		int deposit=0;
		for( i=0;i<=person.length;i++){
			System.out.println("Choose 1: For Withraw \n Choose 2: For deposit");
			int choice=util.Scanner1();	
		switch(choice)
		{
		case 1:
			System.out.println("Amount to be withraw");
			withraw=util.Scanner1();
			totalcash=totalcash-withraw;
			q.dequeue();
			System.out.println("Thankyou For Withraw");
			break;
			
		case 2:
			System.out.println("Amount to be deposit");
			deposit=util.Scanner1();
			totalcash=totalcash+deposit;
			q.dequeue();
			System.out.println("Thankyou for deposit");
			break;
		default:
				System.out.println("Invalid");
		}
		System.out.println(totalcash);
		
	}
		q.show();
	}
}
