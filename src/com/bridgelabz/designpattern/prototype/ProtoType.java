package com.bridgelabz.designpattern.prototype;

import com.bridgelabz.designpattern.util.Utility;

public class ProtoType {

	public static void main(String[] args) {
Employee employee=new Employee();
	 String ename=Utility.getString();
	 employee.setEname(ename);
	 String name=Utility.getString();
	 employee.setName(name);
	 int age=Utility.getInt();
	 employee.setAge(age);
	 int eid=Utility.getInt();
	 employee.setEid(eid);
	 
	 System.out.println(employee);
	 Employee employee1=(Employee)employee.getClone();
	 
		System.out.println(employee1);
		employee1.setEid(4);
		System.out.println(employee1);
	}

}
