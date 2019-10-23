package com.bridgelabz.designpattern.facade.main;

import com.bridgelabz.designpattern.util.Utility;

public class User {

	public static void main(String[] args) {
		ShopKeeper shopKeeper=new ShopKeeper();
		int mobile;
		System.out.println("1. for Infocus 2. for Nokia");
		mobile=Utility.getInt();
		
		switch(mobile) {
		case 1:
		shopKeeper.infocusSale();
		break;
		case 2:
		shopKeeper.nokiaSale();
		break;
		default:System.out.println(" enter correct choice");
		break;
		}
		
	}

}
