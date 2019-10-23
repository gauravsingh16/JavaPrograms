package com.bridgelabz.JSON.stocks.readandwrite;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.JSON.stocks.models.StockPortfolio;
import com.bridgelabz.JSON.stocks.models.Userdefine;
import com.google.gson.Gson;

public class StockImplement {
	
	public void writeToJson(List<Userdefine> stockObject) throws IOException {
		
		Gson gson=new Gson();
		String json=gson.toJson(stockObject);
		FileWriter filewriter=new FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\stockAccount.json");
		filewriter.write(json);
		
		filewriter.close();
		
		
}
}