	package com.bridgelabz.JSON.stocks.interfaceimplements;

	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;
	import org.json.simple.parser.ParseException;

	import com.bridgelabz.JSON.stocks.interfaces.StocksWorking;
	import com.bridgelabz.JSON.stocks.models.StockPortfolio;
	import com.bridgelabz.JSON.stocks.models.Userdefine;
	import com.bridgelabz.JSON.stocks.models.Userlist;
	import com.bridgelabz.JSON.stocks.readandwrite.Userdetails;
	import com.bridgelabz.Utility.Util;

	public class Businessrecord implements StocksWorking {
		List<Userdefine>buyer=new ArrayList<>();
		Userdetails details=new Userdetails();
		Userdefine users=new Userdefine();
		List<StockPortfolio>stocks=users.getStocks();
		StockPortfolio stock=new StockPortfolio();
		List<Userdefine>define=new ArrayList<Userdefine>();
		List<StockPortfolio>stockportfolio=new ArrayList<StockPortfolio>();
		Util util=new Util();
		public Businessrecord()
		{	JSONParser parser = new JSONParser();
		try{
			JSONArray arr = (JSONArray) parser.parse(new FileReader("C:\\Users\\Gaurav\\workspace\\bridgelabz\\userdetails.json"));

				for (Object obj : arr) {
					JSONObject obj1 = (JSONObject) obj;
					Userdefine userdefine=new Userdefine();
					userdefine.setUsername((String) obj1.get("username"));
					userdefine.setAmount((int)(long)obj1.get("amount"));
					userdefine.setStocks((List<StockPortfolio>)obj1.get("stocks"));
					buyer.add(userdefine);
					//System.out.println(buyer);
					
		}	
		}catch(IOException |ParseException e)
		{
			e.printStackTrace();
		}
	}

		public void buy(String stockname, int stockno) {
	try{
		for (StockPortfolio port : stockportfolio )
			{
				if(port.getName().equals(stockname))
				{ 
					port.setNum(stockno);
					int totalamount=stockno*port.getPrice();
					port.setPrice(totalamount);
					stocks.add(port);
					users.setStocks(stocks);
					users.setAmount(users.getAmount()-totalamount);
					details.addToJson(define);
				}
			}
		}catch(IOException e)
	{
			e.printStackTrace();
		}
		}

		@Override
		public void sell(Userlist names, String stockname, int stockno) {
		
		}
		}

	
	
