package com.bridgelabz.datastructure;

import java.io.File;
import java.util.Scanner;

import com.bridgelabz.Utility.*;
public class Unorderdlist {
	public static class Node {
		public String data;
		public Node next;

	}

	 Node head;

	 Node insert(Node root, String item) {
		Node temp = new Node();
		Node ptr;
		temp.data = item;
		temp.next = null;

		if (root == null) {
			root = temp;
			head = temp;
		} else {
			ptr = head;
			ptr = root;
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = temp;
		}
		return root;
	}

	 void display() {
		System.out.println("Updated linked list is");
		Node root1 = head;
		while (root1 != null) {
			System.out.print(root1.data + " ");
			root1 = root1.next;
		}
		System.out.println();
	}

	 int count = 0;

	public  void search(Node root, String str) {

		Node ptr1;
		ptr1 = head;

		while (ptr1 != null) {
			if (ptr1.data.equals(str)) {
				System.out.println("Element found");
				remove(str);
				break;	
				}
			ptr1 = ptr1.next;
			
		}System.out.println();
		insert(root, str);

	}

	public  void remove(String str) {
		Node nptr = new Node();
		nptr = head;
		Node prev = null;
		if (head.data.equals(str)) {
			head = head.next;

			System.out.println("1st element removed ");
			display();

		}
		while (!nptr.data.equals(str)) {
			prev = nptr;
			nptr = nptr.next;
		}
		nptr = nptr.next;
		prev.next = nptr;
		nptr = null;
		System.out.println("Removed");
		display();
	}

	 Node arrayToList(String[] nospace, int n) {
		Node root = null;
		for (int i = 0; i < n; i++)
			root = insert(root, nospace[i]);
		return root;
	}

	public static void main(String[] args) throws Exception {
		Unorderdlist unorderedlist=new Unorderdlist();
		File file = new File("C:\\Users\\Gaurav\\Desktop\\try.txt");
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(file);
		Util util=new Util();
		String word = sb.toString();
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] nospace = line.split(",");
			int length = nospace.length;
			System.out.println("Enter element to search");
			String str = util.Scanner6();
			for (int i = 0; i < nospace.length; i++) {
				Node root = unorderedlist.arrayToList(nospace, length);
				unorderedlist.search(root, str);
				

				break;
			}
		}

	}
}