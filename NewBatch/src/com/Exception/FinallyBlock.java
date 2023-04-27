package com.Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			System.out.println(3/0);
			System.out.println("hello");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Block");
		}
		System.out.println("thank you");

	}

}
