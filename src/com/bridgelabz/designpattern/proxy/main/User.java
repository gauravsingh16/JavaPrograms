package com.bridgelabz.designpattern.proxy.main;

import com.bridgelabz.designpattern.proxy.interfaces.OfficeInternetAcesss;

public class User {

	public static void main(String[] args) {
		OfficeInternetAcesss  officeInternetAcesss=new ProxyInternetClasses("chandra kishore");
		
		officeInternetAcesss.grantInternetAcess();
	}

}
