package com.ExceptionPro;

public class TryAndFinally {

	public static void main(String[] args) {
	System.out.println("welcome");
	
	try {
		System.out.println(5/0);
	}
	/*
	 * catch(Exception e) { System.out.println(e); }
	 * 
	 */
	finally{
		System.out.println("thank you");
	}
	System.out.println("hi");

	}

}
