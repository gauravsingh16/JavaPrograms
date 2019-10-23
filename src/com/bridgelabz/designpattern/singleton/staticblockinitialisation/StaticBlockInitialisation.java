package com.bridgelabz.designpattern.singleton.staticblockinitialisation;

public class StaticBlockInitialisation {
	private StaticBlockInitialisation(){}
	private static StaticBlockInitialisation instance;
	
	static {
		instance=new StaticBlockInitialisation();
	}
public static StaticBlockInitialisation getStaticBlockInitialisation() {
	return instance;
}
	
	
}
