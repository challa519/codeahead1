package com.challa.codeahead1.oop;

public class MySingleton {
	private static MySingleton mySingleton=null;
	private MySingleton(){
	}
	public static MySingleton getInst(){
		if(mySingleton==null){
			synchronized(MySingleton.class){
				if(mySingleton==null){
			     mySingleton=new MySingleton();
				}
			}
		}
		return mySingleton;
	}
}
