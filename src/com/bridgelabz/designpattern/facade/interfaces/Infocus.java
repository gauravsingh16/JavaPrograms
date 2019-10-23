package com.bridgelabz.designpattern.facade.interfaces;

public class Infocus implements MobileShop{

	@Override
	public void modelNum() {
		System.out.println("Infocus model num is m430 ");
		
	}

	@Override
	public void price() {
		System.out.println("Infocus price is 6000 ");
	}

}
