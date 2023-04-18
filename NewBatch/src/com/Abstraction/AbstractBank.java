package com.Abstraction;

abstract class BankRBI{
	String name;
	
	void display(){
		System.out.println("Bank RBI--Terms & Conditiona");
	}
	
	abstract void TC();
	
	BankRBI(){
		System.out.println("            WELCOME\nPlease apply this terms and conditions");
	}
	
	BankRBI(String name){
		this.name=name;
		System.out.println("Special terms and conditions"+"   "+name);
	}
	
}

 class Bsbi extends BankRBI{


	 Bsbi (){
		 super();
		//	super("Bank");
	 }
	@Override
	void TC() {
		System.out.println("SBI Bank ----\nTerms & Conditiona-1\nTerms & Conditiona-2");
	}
	 
 }



public class AbstractBank {

	public static void main(String[] args) {
		Bsbi sbi=new Bsbi();	
		 sbi.display();
		 System.out.println("------------------------------");
	     sbi.TC();
	   

	}

}
