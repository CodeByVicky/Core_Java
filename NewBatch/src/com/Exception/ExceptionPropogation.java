package com.Exception;
import java.util.*;

public class ExceptionPropogation {
	
	void show() throws Exception {
		
		if(1>7) {
			throw new Exception();
		}
		
	}
	
	void show1() throws Exception {
		show();
	}
	
	void show2()  {
		try {
		show1();
		}
		catch(Exception e) {
			System.out.println("this is my exception");
		}
	}

	public static void main(String[] args)  throws Exception{
		
 
		ExceptionPropogation ex=new ExceptionPropogation();
		
		
		//Scanner can=new Scanner(System.in);
		//int a=can.nextInt();
		//try {
			ex.show();
		//}
		//catch(Exception e) {
		//	System.out.println(e);
		//}
		
		System.out.println("thank you");
	}

}
