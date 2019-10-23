package com.bridgelabz.JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.Utility.Util;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class Try {

	public static void main(String[] args) throws JsonIOException, IOException {
		JSONObject obj=new JSONObject();
		Gson gson=new Gson();
		Trying tried=new Trying();
		Util util=new Util();
		Map m=new LinkedHashMap(2);
		System.out.println("Name is");
		String name=util.Scanner6();
		
		tried.setName(name);
		obj.get(name);
		System.out.println("Age is");
		int age=util.Scanner1();
		obj.get(age);
		tried.setAge(age);
		JSONArray array=new JSONArray();
		array.add(tried);
		System.out.println(array);
		String json=gson.toJson(array);
		FileWriter filewriter=new FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\tried.json");
		filewriter.write(json);
		filewriter.close();
		//gson.toJson(array,new FileWriter("C:\\Users\\Gaurav\\workspace\\bridgelabz\\tried.json"));	
		
	}

	}


