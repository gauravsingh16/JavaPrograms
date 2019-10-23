package com.bridgelabz.JSON.stocks.main;

import java.io.IOException;
import com.bridgelabz.JSON.stocks.interfaceimplements.*;
import java.text.ParseException;

public class Stock extends Stocksimplements{

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
		Stock stock=new Stock();
		stock.addstocks();
		stock.total();
}}
