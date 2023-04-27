package com.ExceptionPro;

public class CustomDemo {
	
	public void checkAge(int age) throws NegativeAgeExecption{
		if(age < 0) {
			throw new NegativeAgeExecption();
		}
		else
			System.out.println("valid");
	}

	public static void main(String[] args) {
		CustomDemo d= new CustomDemo();
		try {
			d.checkAge(12);
		}
		catch(NegativeAgeExecption e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("thank you");

	}

}
