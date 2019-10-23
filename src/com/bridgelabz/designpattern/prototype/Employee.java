package com.bridgelabz.designpattern.prototype;

public class Employee {
 @Override
	public String toString() {
		return "Employee [ename=" + ename + ", name=" + name + ", age=" + age + ", eid=" + eid + "]";
	}
String ename;
 String name;
 int age;
 int eid;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public Employee getClone() {
	
	return new Employee(ename,name,age,eid);
}
public Employee(String ename, String name, int age, int eid) {
	super();
	this.ename = ename;
	this.name = name;
	this.age = age;
	this.eid = eid;
}
public Employee() {
	
}	
	
}
