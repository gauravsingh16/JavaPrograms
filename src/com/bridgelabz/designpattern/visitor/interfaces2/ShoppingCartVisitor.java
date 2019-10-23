package com.bridgelabz.designpattern.visitor.interfaces2;

import com.bridgelabz.designpattern.visitor.interfaces.Book;
import com.bridgelabz.designpattern.visitor.interfaces.Pen;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Pen pen);
}
