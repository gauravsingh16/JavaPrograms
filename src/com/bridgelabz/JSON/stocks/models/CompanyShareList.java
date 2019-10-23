package com.bridgelabz.JSON.stocks.models;

public class CompanyShareList {
private String companyname;
private String shares;
public int amount;
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getShares() {
	return shares;
}
public void setShares(String shares) {
	this.shares = shares;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "CompanyShareList [companyname=" + companyname + ", shares=" + shares + ", amount=" + amount + "]";
}


}
