package com.ExceptionPro;


class NotPositiveNumber extends Exception {
	 NotPositiveNumber() {
		System.out.println("Not Positve Number");
	}
}

/*
interface NotPositiveNumber extends throwable{
	NotPositiveNumber() {
		
	}
		
	
}*/
public class Propogation {
	
	
	Propogation(int i) throws NotPositiveNumber
	{
		
		int c=10/i;
		
		if(c>1) {
			System.out.println("c is greater than 1");
		}
		else {
			throw new NotPositiveNumber();
		}
	}

	public static void main(String[] args) {
		int i=-8;
		try {
		Propogation pro= new Propogation(i);
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}

}
