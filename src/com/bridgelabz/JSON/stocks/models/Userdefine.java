package com.bridgelabz.JSON.stocks.models;

import java.util.List;

public class Userdefine {
private String username;
@Override
public String toString() {
	return "Userdefine [username=" + username + ", amount="
			+ amount + ", stocks=" + stocks + "]";
}
private int amount;


private  List<StockPortfolio> stocks;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public List<StockPortfolio> getStocks() {
	return stocks;
}
public void setStocks(List<StockPortfolio> stocks) {
	this.stocks = stocks;
}




}
