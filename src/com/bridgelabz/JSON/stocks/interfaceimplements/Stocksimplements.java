package com.bridgelabz.JSON.stocks.interfaceimplements;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.JSON.stocks.interfaces.Stocksadd;
import com.bridgelabz.JSON.stocks.models.StockPortfolio;
import com.bridgelabz.JSON.stocks.readandwrite.StockUpdate;
import com.bridgelabz.Utility.Util;

public class Stocksimplements implements Stocksadd {
	List<StockPortfolio>listing=new ArrayList<StockPortfolio>();
	StockUpdate update = new StockUpdate();
	StockPortfolio stockPort = new StockPortfolio();
	public Stocksimplements()
	{	JSONParser parser = new JSONParser();
		try{
			JSONArray arr = (JSONArray) parser.parse(new FileReader("C:\\Users\\Gaurav\\workspace\\bridgelabz\\userdetails.json"));

				for (Object obj : arr) {
					JSONObject obj1 = (JSONObject) obj;
					StockPortfolio stockportfolio=new StockPortfolio();
					stockportfolio.setName((String) obj1.get("name"));
					stockportfolio.setNum((int)(long)obj1.get("num"));
					stockportfolio.setPrice((int) obj1.get("price"));
					
					listing.add(stockportfolio);
		}	
		}catch(IOException |ParseException e)
		{
			e.printStackTrace();
		}
	}
	public void addstocks(){
		Util util = new Util();
		try{
		
		System.out.println("Name of stock");
		String nameofstock = util.Scanner6();
		stockPort.setName(nameofstock);
		System.out.println("Number of stock");
		int number1 = util.Scanner1();
		stockPort.setNum(number1);
		System.out.println("Price of stock");
		int pricestock = util.Scanner1();
		stockPort.setPrice(pricestock);

		listing.add(stockPort);

		update.addToJson(listing);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	public void total()
	{	
		try{int totalprice = 0;
		for (StockPortfolio stock : listing) {

			totalprice = totalprice + (stock.getNum() * stock.getPrice());
			stock.setPrice(totalprice);
		}
		update.addToJson(listing);
	}catch(Exception e)
		{
		e.printStackTrace();
	}
	
	}}



