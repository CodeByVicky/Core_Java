package com.ExceptionPro;



public class NegativeAgeExecption extends Exception {
	
	NegativeAgeExecption (){
		System.out.println("Negative Number");
	}
	
	NegativeAgeExecption(String msg){
		super(msg);
	}

	public static void main(String[] args) {
		
	}

}
