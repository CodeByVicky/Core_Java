package com.Exception;

public class Using_Interaface implements MyInterface {

	public void show() throws Exception {
		System.out.println("this my exception");
	}

	public static void main(String[] args) {
		
		try {
			new Using_Interaface().show();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
