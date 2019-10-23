package com.bridgelabz.designpattern.facade.interfaces;

public class Nokia implements MobileShop {

	@Override
	public void modelNum() {
		
		System.out.println("Nokia model number 123");
	}

	@Override
	public void price() {
		System.out.println("Nokia price  5000");
		
	}

}
