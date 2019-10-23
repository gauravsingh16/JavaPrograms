package com.bridgelabz.JSON.stocks.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.JSONParser;

import com.bridgelabz.JSON.stocks.models.CompanyShareList;
import com.bridgelabz.JSON.stocks.readandwrite.LinkedlistReadAndWrite;
import com.bridgelabz.Utility.*;
import com.bridgelabz.datastructure.Unorderdlist.Node;

public class Companysharelinked {
	// ....................NODE CLASS ..............................
	static class Node {
		public String data;
		public Node next;

	}

	static Node head;

	// .....................INSERT METHOD...........................
	 Node insert(String item) {
		Node temp = new Node();
		temp.data = item;
		temp.next = null;
		Node ptr = null;
		if (head == null) {
			temp.data = item;
			head = temp;
		} else {
			ptr = head;
			while (ptr.next != null)
				ptr = ptr.next;

		}
		ptr.next = temp;
		temp.data = item;
		return temp;
	}

	// ......................DISPLAY METHOD............................
	 void display() {
		System.out.println("Updated linked list is");
		Node root1 = head;
		while (root1 != null) {
			System.out.print(root1.data + " ");
			root1 = root1.next;
		}
		System.out.println();
	}

	// .......................REMOVE METHOD...............................
	 void remove(String str) {
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
		// display();
	}

	// ....................MAIN METHOD.........................................
	public static void main(String[] args) throws IOException {
		Util util = new Util();
		Companysharelinked link = new Companysharelinked();
		CompanyShareList share = new CompanyShareList();
		List<CompanyShareList> ss = new ArrayList<CompanyShareList>();
		
		System.out.println("Enter company name");
		String name = util.Scanner6();
		System.out.println("Enter Company shares");
		String shares = util.Scanner6();
		share.setCompanyname(name);
		share.setShares(shares);
		ss.add(share);
		LinkedlistReadAndWrite read=new LinkedlistReadAndWrite();

		//List<Companysharelinked>company= read.readFromJson();
		//read.addToJson(shares);;
		System.out.println("Choose '1' for insert" + "\n Choose '2' for delete ");
		int choice = util.Scanner1();
		// ..................SWITCH CASES....................
		switch (choice) {
		//.....................TO INSERT..............................
		case 1:
			System.out.println("Inserting");
			link.insert(shares);
			read.addToJson(shares);

			break;
		//...................TO REMOVE.................................
		case 2:

			System.out.println("Removing");
			link.remove(shares);
			read.addToJson(shares);
			break;

		default:
			System.out.println("Thankyou");
		}
	}
}
