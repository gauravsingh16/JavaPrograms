package com.bridgelabz.designpattern.computerfactory.model;

import com.bridgelabz.designpattern.computerfactory.abstractclass.Computer;

public class Server extends Computer {
	String ram;
	String hdd;
	String cpu;
	
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	
	
}
