package com.bridgelabz.JSON.stocks.models;
import java.util.List;


public class Userlist {
	String username;
	int amount;
	public List<Userdefine> stocks;
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
	public List<Userdefine> getStocks() {
		return stocks;
	}
	public void setStocks(List<Userdefine> stocks) {
		this.stocks = stocks;
	}
}

