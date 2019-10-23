package com.bridgelabz.datastructure;

public class Queueusinglinkedlist extends Anagramtwod{
		public Node front,rear;
		public int size;
		public int total;
		static class Node{
			int data;
			Node next;
		}
		public Queueusinglinkedlist()
		{
			front=null;
			rear=null;
			size=0;
			total=0;
		}
		public boolean isEmpty()
		{
			return(size==0);
		}
		public int enque(int data1)
		{
			Node node=new Node();
			node=rear;
			if(rear==null)
			{
				front=rear=node;
				
			}else
			{
				rear.next=node;
				rear=node;
			}
			System.out.print("=>"+data1);
			return data1;
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
		Queueusinglinkedlist ll=new Queueusinglinkedlist();
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
					ll.enque(arr3[i]);
				}	
		
	}

}
