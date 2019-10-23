package com.bridgelabz.designpattern.visitor.interfaces2;

import com.bridgelabz.designpattern.visitor.interfaces.Book;
import com.bridgelabz.designpattern.visitor.interfaces.Pen;

public class BookStoreImpl implements ShoppingCartVisitor{

	@Override
	public int visit(Book book) {
		int price;
		price=book.getPrice();
		return price;
	}

	@Override
	public int visit(Pen pen) {
		int cost;
		cost=pen.getPrice();
		return cost;
	}

}
