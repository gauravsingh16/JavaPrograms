package com.bridgelabz.designpattern.computerfactory.main;

import com.bridgelabz.designpattern.computerfactory.abstractclass.Computer;
import com.bridgelabz.designpattern.computerfactory.model.Laptop;
import com.bridgelabz.designpattern.computerfactory.model.Pc;
import com.bridgelabz.designpattern.computerfactory.model.Server;

public class ComputerFactory {

	public static  Computer getComputer(String type,String ram,String hdd,String cpu) {
		 if(type=="Pc") {
			 return new Pc(ram, hdd, cpu);
			 
		 }else if(type=="Laptop"){
			 return new Laptop(ram, hdd, cpu);
			 
		 }else if(type=="Server"){
			 return new Server(ram, hdd, cpu);
			 
		 }
		return null;


	 }
	
	
}
