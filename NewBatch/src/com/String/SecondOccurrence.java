package com.String;

public class SecondOccurrence {
	int count=0;
	int countC=0;
	int space=0;
	
	void show(String s) {
		for(int i=0;i<s.length();i++) {
			countC++;
			if(s.charAt(i)==' ') {
				space++;
			}
			if(s.charAt(i)=='a') {
			   count++;	
			}
			if(count==2) {
				break;
			}
		}
		System.out.println(countC-space);
	}

	public static void main(String[] args) {
		String s=("c programming language");
		
		SecondOccurrence se= new SecondOccurrence();
		se.show(s);
	}

}
