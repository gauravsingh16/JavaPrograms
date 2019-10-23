package com.bridgelabz.designpattern.singleton.threadsafeinitialisation;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton(){}
     public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
    	 if(instance==null) {
    		 instance=new ThreadSafeSingleton();
    	 }
		return instance;
    	 
    	 
     }
	
	
}
