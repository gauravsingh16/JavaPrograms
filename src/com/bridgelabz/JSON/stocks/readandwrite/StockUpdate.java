package com.bridgelabz.JSON.stocks.readandwrite;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.bridgelabz.JSON.stocks.models.StockPortfolio;
import com.google.gson.Gson;

public class StockUpdate {

	public void addToJson(List<StockPortfolio> stockObject) throws IOException {
		Gson gson=new Gson();
		String json=gson.toJson(stockObject);
		FileWriter filewriter=new FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\stocks.json");
		filewriter.write(json);
		
		filewriter.close();
		
		
	}

		


}
