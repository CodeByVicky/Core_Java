package com.String;
import java.util.*;

public class OccurrenceInputLetter {

		

	public static void main(String[] args) {
      
		String s="java is a good Programming language";
		int count=0;
		char ch;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter");
		ch=sc.next().charAt(0);
		int totalcount=s.length();
		//System.out.println(totalcount);
		
		
		for(int i=0;i<totalcount;i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch+" "+count);
		
	}

}
