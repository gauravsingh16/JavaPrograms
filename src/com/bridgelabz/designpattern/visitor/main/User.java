package com.bridgelabz.designpattern.visitor.main;

import com.bridgelabz.designpattern.visitor.interfaces.Book;
import com.bridgelabz.designpattern.visitor.interfaces.ItemElement;
import com.bridgelabz.designpattern.visitor.interfaces.Pen;
import com.bridgelabz.designpattern.visitor.interfaces2.BookStoreImpl;
import com.bridgelabz.designpattern.visitor.interfaces2.ShoppingCartVisitor;

public class User {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[]{new Book("english", 200),new Book("story", 500),new Book("dream", 900),
				new Pen("Reynolds", 20),new Pen("kishore", 36),new Pen("ink", 26)};
		
			int total=calculatePriceItems(items);
			System.out.println(total);
	}

	private static int calculatePriceItems(ItemElement[] items) {
		ShoppingCartVisitor visitor = new BookStoreImpl();
		
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
