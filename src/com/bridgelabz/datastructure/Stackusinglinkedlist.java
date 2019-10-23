package com.bridgelabz.datastructure;

public class Stackusinglinkedlist extends Anagramtwod{
		static class Node{
			int data;
			Node next;
		}
		static Node top;
		public void push(int data1)
		{
			Node temp=new Node();
			
			if(temp==null)
			{
				System.out.println("Underflow");
				return;
			}else
			{
				temp.data=data1;
				temp.next=top;
				top=temp;
			}
		}
		public void display()
		{
			Node temp=top;
			while(temp!=null)
			{
				System.out.print("=>"+temp.data);
				temp=temp.next;
			}
		}
		public int[] compare(int[]arr1,int[]arr2)
		{	int[]arr3=new int[1000];
			for(int i=0;i<arr1.length;i++)
			{	for(int j=0;j<arr2.length;j++)
					if(arr1[i]==arr2[j])
			{		if(arr1[i]>0 && arr2[i]>0)
					System.out.print(" "+arr1[i]);
				arr3[i]=arr1[i];
			}
			}System.out.print("\n");
			return arr3;
		}
	public static void main(String[] args) {
		Stackusinglinkedlist ll=new Stackusinglinkedlist();
		Anagramtwod stack=new Anagramtwod();
		int []arr1=stack.set();
		int[]arr2=new int[999];
		
		for(int i=0;i<=arr2.length;i++){	
			int value=stack.reverse(arr1[i]);
			
				if(value>0)
			{
				 arr2[i]=value;
				 System.out.print(arr2[i]+" ");
			}
				}System.out.println("/n");
				System.out.println("reverse");
				int[]arr3=ll.compare(arr1, arr2);	
			
				for(int i=0;i<arr3.length;i++)
				{	if(arr3[i]>0)
					ll.push(arr3[i]);
				}	ll.display(	);
		}

	}
