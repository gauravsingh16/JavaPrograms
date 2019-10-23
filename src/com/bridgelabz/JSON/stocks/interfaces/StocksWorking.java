package com.bridgelabz.JSON.stocks.interfaces;

import com.bridgelabz.JSON.stocks.models.Userdefine;
import com.bridgelabz.JSON.stocks.models.Userlist;

public interface StocksWorking {
	
public void buy(String stockname,int stockno);
public void sell(Userlist names,String stockname,int stockno);

}
