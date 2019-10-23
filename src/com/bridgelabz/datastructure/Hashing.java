package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.datastructure.Orderedlist.Node;

public class Hashing {
	static class Node {
		public int data;
		public Node next;

	}

	 Node head;

	void insert(int item) {
		Node temp = new Node();
		
		if (head == null) {
			temp.data=item;
		} else {
			Node ptr = head;
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = temp;	}	
			temp.data=item;
			
		}
		
	
	 void display() {
		//System.out.println("Updated linked list is");
		Node root1 = head;
		while (root1 != null) {
			System.out.print(root1.data + " ");
			root1 = root1.next;
		}
		System.out.println();
	}

	static int count = 0;

	public  void search(int num) {

		Node node;
		node = head;
		while (node != null) {
			if (node.data == num) {
				System.out.println("Element found");
				sort();
				remove(num);
				
				break;
			}
			node = node.next;

		}
		System.out.println();

	}

	public void remove(int num) {
		Node nptr = new Node();
		nptr = head;
		Node prev = null;
		if (head.data == num) {
			head = head.next;

			System.out.println("1st element removed ");
			

		}
		while (!(nptr.data == num)) {
			prev = nptr;
			nptr = nptr.next;
		}
		nptr = nptr.next;
		prev.next = nptr;
		nptr = null;
		System.out.println("Removed");
		

	}

	public void sort() {
		Node current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	static Hashing[] obj = new Hashing[10];
	

	public void insertion(int number) {
		int remainder = number % 11;
		if (obj[remainder] == null) {
			obj[remainder] = new Hashing();
			obj[remainder].insert(number);
			
		
		} else {
			
			obj[remainder].insert(number);
		}
			
	}
	public void searching(int number){
		int remainder=number%11;
		if(obj[remainder]!=null)
		{
			obj[remainder].search(number);
		}else
		{	insertion(number);
			
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Hashing hash=new Hashing();
		File file = new File("C:\\Users\\Gaurav\\Desktop\\hashing.txt");
		Scanner scan = new Scanner(file);
		Scanner scan1=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
			String line = scan.nextLine();
			String[] nospace = line.split(",");
			int length = nospace.length;
			int[] a = new int[nospace.length];
			for (int k = 0; k < length; k++) {
				a[k] = Integer.parseInt(nospace[k]);
			}
			for (int j = 0; j < a.length; j++) {
				hash.insertion(a[j]);
			}
			for(int i=0;i<obj.length;i++)
			{
				if(obj[i]!=null)
				{
					System.out.print(i+"   ");
					obj[i].display();
				}else{
					System.out.print(i+"   ");
				System.out.print(" ");
				}
			}
			System.out.println("\nNo to be searched");
			int num=scan1.nextInt();
			hash.searching(num);
			for(int i=0;i<obj.length;i++)
			{
				if(obj[i]!=null)
				{
					System.out.print(i+"   ");
					obj[i].display();
				}else{
					System.out.print(i+"   ");
				System.out.print(" ");
				}
			
}
}}