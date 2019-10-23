package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Orderedlist {
	static class Node {
		public int data;
		public Node next;

	}

	 Node head;

	 Node insert(Node root, int item) {
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

	public  void search(Node root, int num) {

		Node ptr1;
		ptr1 = head;

		while (ptr1 != null) {
			if (ptr1.data == num) {
				System.out.println("Element found");
				sort(root);
				remove(num);
				break;
			}
			ptr1 = ptr1.next;

		}
		System.out.println();
		// insert(root, str);

	}

	public  void sort(Node root) {
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

	public  void remove(int num) {
		Node nptr = new Node();
		nptr = head;
		Node prev = null;
		if (head.data == num) {
			head = head.next;

			System.out.println("1st element removed ");
			display();

		}
		while (!(nptr.data == num)) {
			prev = nptr;
			nptr = nptr.next;
		}
		nptr = nptr.next;
		prev.next = nptr;
		nptr = null;
		System.out.println("Removed");
		display();
	}

	Node arrayToList(int[] arr, int n) {
		Node root = null;
		for (int i = 0; i < n; i++)
			root = insert(root, arr[i]);
		return root;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Gaurav\\Desktop\\trying.txt");
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(file);
		Util util=new Util();
		Orderedlist order=new Orderedlist();
		String n = sb.toString();
		int[] a = new int[7];
		int i = 0;

		while (scan.hasNextLine()) {

			String line = scan.nextLine();
			String[] nospace = line.split(",");

			int length = nospace.length;
			for (int k = 0; k < length; k++) {

				a[k] = Integer.parseInt(nospace[k]);
				System.out.println(nospace[k]);
			}
			System.out.println("Enter number to search");
			int num =util.Scanner1();
			for (i = 0; i < nospace.length; i++) {
				Node root = order.arrayToList(a, length);

				order.search(root, num);
				break;
			}
		}

	}

}
