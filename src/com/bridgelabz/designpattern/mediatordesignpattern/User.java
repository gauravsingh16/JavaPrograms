package com.bridgelabz.designpattern.mediatordesignpattern;

public class User {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}
	public void sendMessage(String msg) {
		ChatRoom.sendMessage(this.name,msg);
	}
	

}
