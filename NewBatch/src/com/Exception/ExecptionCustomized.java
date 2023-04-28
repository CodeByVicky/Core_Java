package com.Exception;

class MyException extends Exception {

	@Override
	public String getMessage() {
		return "This is My Exception";
	}
}

public class ExecptionCustomized {

	public static void main(String[] args) {

		if (6 > 1) {
			try {

				//throw new MyException();
				throw new ArithmeticException("this is Direct Exception");
			} catch (Exception e) {
				//System.out.println(e.getMessage());
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		System.out.println("thanks");

	}

}
