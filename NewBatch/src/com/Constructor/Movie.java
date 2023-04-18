package com.Constructor;

import java.util.Scanner;

public class Movie {
	String name,mname;
	int age;

	void can() {
		System.out.println("1-Avenger- 500\n2-Iron man-500");
		System.out.println("-----------------------------------");
		
		Scanner can1=new Scanner(System.in);
	    System.out.println("Enter your name :");
	     name=can1.next();
	    

		Scanner can2=new Scanner(System.in);
	    System.out.println("Enter you age :");
	     age=can2.nextInt();
	    
	    Scanner can3=new Scanner(System.in);
	    System.out.println("Enter Movie name :");
	     mname=can3.next();
	    
	
	}
	void coupon(){
		
		System.out.println("Do you have coupon\n1-Yes\n2-NO");
		Scanner can=new Scanner(System.in);
		int coup=can.nextInt();
		
		if(coup==1)
		{
	/*	System.out.println("Enter you coupon code");
		int code=can.nextInt();*/
			this.option();
		
	
		}
		else
			System.out.println(name+" "+age+" "+mname+" "+"Price is 500");
		
	}
	
	
	void option(){
		int gold=12345;
		int silver=67890;
		
		Scanner can=new Scanner(System.in);
		System.out.println("Enter you coupon code");
		int code=can.nextInt();
		
		if(gold==code){
			System.out.println(name+" "+age+" "+mname+" "+"Price is 400");
		}
		else if(silver==code){
			System.out.println(name+" "+age+" "+mname+" "+"Price is 450");
		}
		
		else
			System.out.println("enter volid code");
	}
	
	public static void main(String[] args) {
		
		Movie mo=new Movie();
		mo.can();
		mo.coupon();


	}

}
