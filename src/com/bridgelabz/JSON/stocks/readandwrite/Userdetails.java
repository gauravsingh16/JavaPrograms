package com.bridgelabz.JSON.stocks.readandwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.bridgelabz.JSON.stocks.models.Userdefine;
import com.google.gson.Gson;

public class Userdetails {


	public void addToJson(List<Userdefine> stockObject) throws IOException {
		Gson gson=new Gson();
		String json=gson.toJson(stockObject);
		FileWriter filewriter=new FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\userdetails.json");
		filewriter.write(json);
		
		filewriter.close();

	}
}
