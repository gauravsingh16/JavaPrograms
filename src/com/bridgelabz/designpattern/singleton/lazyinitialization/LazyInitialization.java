package com.bridgelabz.designpattern.singleton.lazyinitialization;

public class LazyInitialization {
	private LazyInitialization(){
		
	}
	private static LazyInitialization instance;
	
	public static LazyInitialization getLazyInitialization() {
		if(instance==null) {
			instance=new LazyInitialization();
		}
		return instance;
	}
	
}
