package com.bridgelabz.designpattern.singleton.enumsingleton;

public enum Singleton {
    INSTANCE;
	EnumSingleton instance;

	public EnumSingleton getInstance() {
		return instance;
	}

	public void setInstance(EnumSingleton instance) {
		this.instance = instance;
	}
	
	
	
}
