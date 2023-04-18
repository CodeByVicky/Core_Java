package com.Polymorphism_OverLoading_ComplileTime;

public class OverLoadCalcutator {

	void calculator(int a,int b){
		int c=a+b;
		System.out.println("Addition is :"+c);
		
	}
	
	void calculator (int a,float b){
		int c= a-(int)b;
		System.out.println("Substration is :"+c);
	}
	
	void calculator(float a,int b){
		int c=(int)a*b;
		System.out.println("Multiplication :"+c);
	}
	
	void calculator(float a,float b){
		
		float c=a/b;
		System.out.println("Division :"+c);
	}
	void calculator(boolean a ){
		if(a==true)
		System.out.println("vicky");
		
		else
			System.out.println(a);
	}
	
	
	public static void main(String [] args){
		OverLoadCalcutator cal=new OverLoadCalcutator();
		
	/*	cal.calculator(4, 6);
		cal.calculator(19, 5.0f);
		cal.calculator(6.0f, 7);
		cal.calculator(90.0f, 9.0f);
	    cal.calculator(false);*/
	}

}
