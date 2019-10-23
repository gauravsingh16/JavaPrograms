package com.bridgelabz.designpattern.proxy.interfaces;

public class OfficeInternetAcessImpl implements OfficeInternetAcesss {
	String empname;
	public OfficeInternetAcessImpl(String empname) {
		super();
		this.empname = empname;
	}

	@Override
	public void grantInternetAcess() {
		
		System.out.println("internet acess granted to "+empname);
		
	}

}
