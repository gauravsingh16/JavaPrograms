package com.bridgelabz.designpattern.singleton.billpughsingleton;

public class BillPughSingleton {
private	BillPughSingleton(){}

private static class InstanceOfBillPugh{
	private static BillPughSingleton instance = new BillPughSingleton();
	
}
public static BillPughSingleton getBillPughSingleton() {
	return InstanceOfBillPugh.instance;
}
	

}
