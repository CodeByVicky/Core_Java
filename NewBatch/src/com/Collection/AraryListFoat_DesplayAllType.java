package com.Collection;

import java.util.ArrayList;

public class AraryListFoat_DesplayAllType {

	public static void main(String[] args) {
		
		ArrayList f= new ArrayList ();
		
		f.add(null);
		f.add( 34);
	
		
		System.out.println(f);
		
		System.out.println("/////////////////////////////////////////////////");
		
		for(int i=0;i<f.size();i++) {
			System.out.println(f.get(i));
		}
		
		System.out.println("///////////////////////////////////////////////");
	
		  for(Object  s:f) { System.out.println(s);
		  
		  } System.out.println("////////////////////////////////////////////");
		  
		
		
		
	}

}
