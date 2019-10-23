package com.bridgelabz.JSON.DataManagement.model;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.Utility.*;
public class InventoryDataManagement {

	public static void main(String[] args) {
		Util util=new Util();
		System.out.println("Press 1 for Rice"+"\nPress 2 for Wheat"+"\nPress 3 for Pulses");
		int choice=util.Scanner1();
		//JSONObject obj=new JSONObject();
		JSONObject product=new JSONObject();
		JSONObject product1=new JSONObject();
		JSONObject product2=new JSONObject();
		switch(choice)
		{
		case 1:
		Map m=new LinkedHashMap(3);
		
		System.out.println("Enter name of Rice");
		String name=util.Scanner6();
		m.put("name", name);
		System.out.println("Enter weight");
		int weight=util.Scanner1();
		m.put("Weight", weight);
		System.out.println("Enter price");
		int price=util.Scanner1();
		m.put("Price", price);
		

		product.put("Rice Values", m);
		break;
		case 2:
		//JSONObject obj2=new JSONObject();
		Map m1=new LinkedHashMap(3);
		System.out.println("Enter name of wheat");
		String name1=util.Scanner6();
		m1.put("name",name1);
		System.out.println("Enter weight");
		int weight1=util.Scanner1();
		m1.put("Weight", weight1);
		System.out.println("Enter price");
		int price1=util.Scanner1();
		m1.put("Price", price1);
		
		
		product1.put("Wheat Values",m1);
		break;
		case 3:
		//JSONObject obj3=new JSONObject();
		Map m2=new LinkedHashMap(3);
		System.out.println("Enter name of Pulses");
		String name2=util.Scanner6();
		m2.put("name",name2);
		System.out.println("Enter weight");
		int weight2=util.Scanner1();
		m2.put("Weight", weight2);
		System.out.println("Enter price");
		int price2=util.Scanner1();
		m2.put("Price", price2);
		
		
		product2.put("Pulses Values", m2);
		break;
		}
		JSONArray productlist=new JSONArray();
		productlist.add(product);
		productlist.add(product1);
		productlist.add(product2);
		
		try (FileWriter file = new FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\products.json")) {
			 
            file.write(productlist.toJSONString(productlist));
            file.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
