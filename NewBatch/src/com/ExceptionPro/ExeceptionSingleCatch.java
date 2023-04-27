package com.ExceptionPro;

public class ExeceptionSingleCatch {

	public static void main(String[] args) {
		
		System.out.println("welcome");
		try
		{
			int  x=10;
			int ans =x/0;
			System.out.println(ans);
				
		}
		
		catch(ArithmeticException e) {
			System.out.println("custom exception");
		}
		System.out.println("thank you");
	}

}
