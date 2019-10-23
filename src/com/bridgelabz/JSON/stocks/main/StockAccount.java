package com.bridgelabz.JSON.stocks.main;
import java.io.IOException;
import com.bridgelabz.JSON.stocks.interfaceimplements.Businessrecord;
import com.bridgelabz.Utility.*;

public class StockAccount extends Businessrecord{
	
public static void main(String[] args)  {
	StockAccount account=new StockAccount();	
	int choice=0;
	Util util=new Util();
		System.out.println("Choose '1' to buy" +"\n Choose '2' to sell");
		choice=util.Scanner1();
		switch(choice)
		{
		case 1:
			System.out.println("What stock to buy");
			String stockname=util.Scanner6();
			System.out.println("No of stocks to buy");
			int stockno=util.Scanner1();
			account.buy(stockname, stockno);
			
			break;
		default:
			break;
	}
		System.out.println("end");
	}
}
