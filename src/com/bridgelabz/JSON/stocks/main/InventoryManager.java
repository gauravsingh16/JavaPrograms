package com.bridgelabz.JSON.stocks.main;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


import com.bridgelabz.JSON.stocks.models.StockPortfolio;
import com.bridgelabz.JSON.stocks.readandwrite.InventoryRead;
import com.bridgelabz.Utility.Util;

public class InventoryManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Util util = new Util();
		StockPortfolio stockPort = new StockPortfolio();
		InventoryRead inventoryread = new InventoryRead();
		List<StockPortfolio> listing = inventoryread.readFromJson();

		System.out.println("Name of stock");
		String nameofstock = util.Scanner6();

		System.out.println("Number of stock");
		int number1 = util.Scanner1();

		System.out.println("Price of stock");
		int pricestock = util.Scanner1();

		stockPort.setName(nameofstock);
		stockPort.setNum(number1);
		stockPort.setPrice(pricestock);
		listing.add(stockPort);

		inventoryread.addToJson(listing);

		

	}

}
