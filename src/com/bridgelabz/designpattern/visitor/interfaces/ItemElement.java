package com.bridgelabz.designpattern.visitor.interfaces;

import com.bridgelabz.designpattern.visitor.interfaces2.ShoppingCartVisitor;

public interface ItemElement {

	int accept(ShoppingCartVisitor visitor);
}
