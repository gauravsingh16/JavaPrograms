package com.bridgelabz.JSON.stocks.readandwrite;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.JSON.stocks.models.StockPortfolio;



public class InventoryRead {
	ObjectMapper mapper = new ObjectMapper();

	public void addToJson(List<StockPortfolio> stockObject) throws IOException {
		// FileWriter file=new
		// FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\stocks.json");

		mapper.writeValue(new File("C:\\Users\\Gaurav\\workspace\\bridgelabz\\Inventory.json"), stockObject);
	}

	public List<StockPortfolio> readFromJson() throws JsonParseException, JsonMappingException, IOException {
		List<StockPortfolio> list = mapper.readValue(
				new File("C:\\Users\\Gaurav\\workspace\\bridgelabz\\Inventory.json"),
				new TypeReference<List<StockPortfolio>>() {
				});

		return list;

	}

}
