package com.bridgelabz.JSON.DataManagement.model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryWriting  {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException,NullPointerException {
		
		JSONParser parser=new JSONParser();
	//..........................FILE READER.........................................	
		try(FileReader file=new FileReader("C:\\Users\\Gaurav\\workspace\\bridgelabz\\products.json"))
				{
					Object obj= parser.parse(file);
					Map m=new LinkedHashMap(3);
					JSONArray inventory=(JSONArray) obj;
					//System.out.println(inventory);
					//inventory.forEach(emp->parseproduct((JSONObject)emp));
				}
				
	}
	
}


