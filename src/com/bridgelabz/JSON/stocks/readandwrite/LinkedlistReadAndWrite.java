package com.bridgelabz.JSON.stocks.readandwrite;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.JSON.stocks.main.*;

public class LinkedlistReadAndWrite {
	ObjectMapper mapper = new ObjectMapper();

	public void addToJson(String stockObject) throws IOException {
		// FileWriter file=new
		// FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\stocks.json");

		mapper.writeValue(new File("C:\\Users\\Gaurav\\workspace\\bridgelabz\\Linkedlist.json"), stockObject);
	}

	public String readFromJson() throws JsonParseException, JsonMappingException, IOException {
		String value = mapper.readValue(
				new File("C:\\Users\\Gaurav\\workspace\\bridgelabz\\Linkedlist.json"),
				new TypeReference<List<Companysharelinked>>() {
				});
		return value;

		

	}

}
