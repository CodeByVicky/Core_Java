package com.String;

public class CountOpration {
	int count=0;
	int countC=0;
	char num=0;
	int charc=0;
	int countS=0;
	int countV=0;
	char find=0;
	void count(String s) {
		for(int i=0;i<s.length();i++) {
			 charc++;
			if(s.charAt(i)>'0' && s.charAt(i)<'9') {
				count++;
				 num=s.charAt(i);
				
			}
			
			 if(s.charAt(i)>='a' && s.charAt(i)<='z')  {
				countC++;
			}
			if(s.charAt(i)==' ') {
				countS++;
			}
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				
				find=s.charAt(i);
				
				countV++;
				System.out.println("Voloes is:"+find+" "+countV);
			}
			
			
			
			
			 
		}
		
		
		
		
		
		System.out.println("Number is:"+num+" "+"count is:"+count);
		System.out.println("total is:"+charc);
		System.out.println("total charter is:"+countC);
		System.out.println("spaceCount is:"+countS);
		
		System.out.println("Voloes is:"+find+" "+countV);
		
		
		
	}

	public static void main(String[] args) {
		
		String s="hello 2 j7ava@";
		
		CountOpration cou=new CountOpration();
		cou.count(s);
	}

}
