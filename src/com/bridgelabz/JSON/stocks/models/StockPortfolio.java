package com.bridgelabz.JSON.stocks.models;

public class StockPortfolio {
		private String name;
		 private int num;
		 private int price;
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "StockPortfolio [name=" + name + ", num=" + num + ", price=" + price + "]";
		}

}
