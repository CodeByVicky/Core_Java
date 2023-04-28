package com.Exception;

public class CustomeDemo2 {
	public static void checkName(String s) throws Exception {
		boolean isdigitpresent =false;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				isdigitpresent = true;
				break;
			}
		}
		
		if(isdigitpresent == true) {
			throw new Exception("name invalid");
		}
		else 
			System.out.println(s);
	}

	public static void main(String[] args) {
		

		try {
			checkName("ne3ha");
		}
		catch(Exception i){
			System.out.println(i);
		}
	}

}
