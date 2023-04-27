package com.String;

/*
 String s="proud country"
convert this string to upper case without using string function*/

public class ConverteUpperCase {
	
	public static void show(String s) {
		for(int i=0;i<s.length();i++) {
			
			int a=(-32)+s.charAt(i);
			
			System.out.print((char)a);
		}
	}

	public static void main(String[] args) {
		 String s="proud country";
		 
		 ConverteUpperCase.show(s);
		
	}

}
