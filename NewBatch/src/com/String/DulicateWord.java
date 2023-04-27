package com.String;

public class DulicateWord {
	public static void duplicate(String s) {
		
		String arr[]=s.split("\\s");
		
		for(String w:arr){  
			System.out.println(w);  
		}
	}

	public static void main(String[] args) {
		 String s=("best in the world");
			
			Duplicatescharacters.duplicate(s);

	}

}
