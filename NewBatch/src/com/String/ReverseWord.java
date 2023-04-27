package com.String;

import java.util.Arrays;

public class ReverseWord {
	
	public static void show(String s) {
		String arr[]=s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
		String temp= arr[i];
		
		char [] ch=temp.toCharArray();
		
		for ( int j=0,k=ch.length-1;j<ch.length/2;j++,k--) {
			char chTemp=ch[j];
			ch[j]=ch[k];
			ch[k]=chTemp;
		}
				
			System.out.print(Arrays.toString(ch));
			
		}
	}

	public static void main(String[] args) {
		String s="hello java";
		
		ReverseWord.show(s);
	}

}
