package com.bridgelabz.designpattern.visitor.interfaces;

import com.bridgelabz.designpattern.visitor.interfaces2.ShoppingCartVisitor;

public class Pen implements ItemElement{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
		
	}
	
}
