package com.bridgelabz.designpattern.singleton.serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Car car=Car.getinstance();
		System.out.println(car);
	FileOutputStream fos=new FileOutputStream("/home/admin1/Programms/DesignPatterns/src/com/bridgelabz/designpattern/singleton/serialisation/car.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos); 
		oos.writeObject(car);
	oos.close();
	FileInputStream  fileInputStream =new FileInputStream ("/home/admin1/Programms/DesignPatterns/src/com/bridgelabz/designpattern/singleton/serialisation/car.ser");
	ObjectInputStream  objectOutputStream  =new ObjectInputStream(fileInputStream); 
	Car car1=(Car)objectOutputStream.readObject();
	objectOutputStream.close();
	System.out.println(car1);
	
		
	}

}
