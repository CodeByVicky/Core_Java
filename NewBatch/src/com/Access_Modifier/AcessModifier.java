package com.Access_Modifier;

public class AcessModifier {
	//show all access modifier using method.
	public void modifier1(){
		System.out.println("public access modifier");
	}
	
	protected void modifier2(){
		System.out.println("protected access modifier");
	}
	
	void modifier3(){
		System.out.println("default access modifier");
	}
	
	 private void modifier4(){
		 System.out.println("private access modifier");
	 }

	public static void main(String[] args) {
		
		AcessModifier ac= new AcessModifier();
		ac.modifier1();
		System.out.println("-----------------------------------");
		
		ac.modifier2();
		System.out.println("-----------------------------------");
		
		ac.modifier3();
		System.out.println("-----------------------------------");
		
		ac.modifier4();
		System.out.println("-----------------------------------");
		

	}

}
