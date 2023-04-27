package com.String;




public class SpaceCutWord {
	public static void show (String s) {
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				System.out.println();
				continue;
			}
			
			System.out.print(s.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		String s=("india is beautiful country");
		SpaceCutWord.show(s);
	}

}
