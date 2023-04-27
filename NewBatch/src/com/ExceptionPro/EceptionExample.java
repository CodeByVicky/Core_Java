package com.ExceptionPro;



public class EceptionExample {
	
	public static void show(int a) throws Exception {
		int b=6,c;
		
		c=b/a;
		throw new Exception("Decice error");
		
		//System.out.println(c);
	}

	public static void main(String[] args) {
		
		try{
			EceptionExample.show(2);
		}
		catch(Exception e) {
			System.out.println(e);
		};
	}

}
