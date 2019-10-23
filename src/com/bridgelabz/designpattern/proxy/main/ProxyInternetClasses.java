package com.bridgelabz.designpattern.proxy.main;

import com.bridgelabz.designpattern.proxy.interfaces.OfficeInternetAcessImpl;
import com.bridgelabz.designpattern.proxy.interfaces.OfficeInternetAcesss;

public class ProxyInternetClasses implements OfficeInternetAcesss {
private String name;
	
	
	public ProxyInternetClasses(String name) {
	super();
	this.name = name;
    }
	OfficeInternetAcesss  officeInternetAcesss=null;

	@Override
	public void grantInternetAcess() {
		if(getRole(name)>4) {
			
			  officeInternetAcesss=new OfficeInternetAcessImpl(name);
			  officeInternetAcesss.grantInternetAcess();
		}
		else
		{
			System.out.println("unable to provide internet acess");
		}
			
		
	}


	private int getRole(String name2) {
		return 5;
	}
	
	
	

}
