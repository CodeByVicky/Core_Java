package com.Polymorphism_Overriding_RunTime;

class bank{
	void show(){
		System.out.println("bank");
	}
}

class subank extends bank{
	 void show(){
		 super.show();
		System.out.println("subbank");
	}
}


public class OverridingExample {

	public static void main(String[] args) {
		
		bank su=new subank();
		su.show();
	

	}

}
