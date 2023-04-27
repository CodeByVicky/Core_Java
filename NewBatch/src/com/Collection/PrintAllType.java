package com.Collection;
import java.util.*;

public class PrintAllType {

	public static void main(String[] args) {
		
		ArrayList<String > al= new ArrayList();
		
		  al.add("red"); al.add("Green"); al.add("blue");
		 
		  System.out.println(al);
		  
		  System.out.println("88888888888888888888888888888888888888888888888888888888888888888888");
		  
		  for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		  
		  System.out.println("88888888888888888888888888888888888888888888888888888888888888888888");
		  
		  
		  for(String s: al) { System.out.println(s); }
		 
		System.out.println("88888888888888888888888888888888888888888888888888888888888888888888");
		  
		
		ArrayList<String > al2= new ArrayList();
		Scanner can=new Scanner(System.in);
		System.out.println("enter three color name");
		
		for(int i=0;i<3;i++) {
			al2.add(can.next());
		}
		
		System.out.println(al2);
		
		System.out.println("88888888888888888888888888888888888888888888888888888888888888888888");
		
		ArrayList<String > al3= new ArrayList();
		
		al3.add(can.next());
		al3.add(can.next());

		al3.add(can.next());
		
		
		System.out.println(al3);
		
	}

}
