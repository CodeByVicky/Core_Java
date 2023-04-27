package com.Exception;

 class InvalidData extends RuntimeException {

	InvalidData(){
		System.out.println("Decimal number is not allowed");
	}
	
	InvalidData(String msg){
		super(msg);
	}
	
 }
public class BinaryNumber {
	
	public static void checkNumber(String s) {
		 boolean isdigitpresent = false;
		 
		 
		 
		 for(int i=0;i<s.length();i++) {
			
				 if(s.charAt(i)!='0' && s.charAt(i)!='1') {
				 isdigitpresent =true;
				
				 }
			 //
	}
		 if(isdigitpresent == true) {
				throw new InvalidData("Number invalid");
			}
			else 
				System.out.println(s);
		}
		
	

	public static void main(String[] args) {
		

		try {
			checkNumber("1014");
		}
		catch(InvalidData i){
			System.out.println(i);
		}

	}


}