package com.Exception;

public class UsingInterface2 implements MyInterface {

	public void show() throws ArithmeticException {
		if (3 == 3) {
			throw new ArithmeticException("try Exceptioin");
		}
	}

	public static void main(String[] args) {
		UsingInterface2 sho = new UsingInterface2();

//		try {
//			sho.show();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		sho.show();

	}

}
