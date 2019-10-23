package com.bridgelabz.JSON.stocks.interfaceimplements;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.JSON.stocks.interfaces.Useradd;
import com.bridgelabz.JSON.stocks.models.StockPortfolio;
import com.bridgelabz.JSON.stocks.models.Userdefine;
import com.bridgelabz.JSON.stocks.readandwrite.Userdetails;
import com.bridgelabz.Utility.*;
public class Useradding implements Useradd{
	Util util=new Util();
	Userdetails details=new Userdetails();
	List<Userdefine>listing=new ArrayList<Userdefine>();
	public Useradding()
	{	JSONParser parser = new JSONParser();
		try{
			JSONArray arr = (JSONArray) parser.parse(new FileReader("C:\\Users\\Gaurav\\workspace\\bridgelabz\\userdefine.json"));

				for (Object obj : arr) {
					JSONObject obj1 = (JSONObject) obj;
					Userdefine userdefine=new Userdefine();
					userdefine.setUsername((String) obj1.get("username"));
					userdefine.setAmount((int)obj1.get("amount"));
					
					listing.add(userdefine);
		}	
		}catch(IOException |ParseException e)
		{
			e.printStackTrace();
		}
	}
@Override
public void useradd() {
try{
	List<Userdefine>userdefine=new ArrayList<>();
	Userdefine user=new Userdefine();
	//ObjectMapper mapper=new ObjectMapper();
	System.out.println("Name of User");
	String name=util.Scanner6();
	user.setUsername(name);
	System.out.println("Enter amount");
	int amount=util.Scanner1();
	
	listing.add(user);
	
	details.addToJson(listing);
}
catch (Exception e) {

	e.printStackTrace();

}
}}
