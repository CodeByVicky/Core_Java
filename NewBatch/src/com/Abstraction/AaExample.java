package com.Abstraction;
abstract class Crcket{
	abstract void rule();
}
abstract class BCCI{
	
	int a=8;
	int b=9;
	BCCI(){
		System.out.println("Boss");
	}
	 abstract void rules();
	 
	 void termsAndCondition(){
		 System.out.println("Please apply is Terms and condition");
	 }
	 
	void show(){
		 System.out.println("NO");
	 }
}

class IPL extends BCCI{

	@Override
	void rules() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AaExample extends BCCI {
	
	
	void rules(){
		super.termsAndCondition();
		System.out.println("Apply rules");
		this.show();
	}
	
	void show(){
	int c=a+b;
		System.out.println("cricket"+" "+c);
	}

	public static void main(String[] args) {
		AaExample aa= new AaExample();
		aa.rules();

	}

}
