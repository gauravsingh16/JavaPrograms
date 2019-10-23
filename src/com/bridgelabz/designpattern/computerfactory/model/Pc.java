package com.bridgelabz.designpattern.computerfactory.model;

import com.bridgelabz.designpattern.computerfactory.abstractclass.Computer;

public class Pc extends Computer{

	String ram;
	String hdd;
	String cpu;
	public Pc(String ram, String hdd, String cpu) {
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
	 @Override
		public String toString() {
			return "Computer [ getRam()=" + getRam() + ", getHdd()=" + getHdd() + ", getCpu()=" + getCpu() + "]";
		}
	}
