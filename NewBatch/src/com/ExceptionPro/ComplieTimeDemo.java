package com.ExceptionPro;



public class ComplieTimeDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysqul.jdbc.Drive");//chaek exception
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
