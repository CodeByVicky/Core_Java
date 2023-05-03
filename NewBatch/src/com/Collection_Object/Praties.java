package com.Collection_Object;

import java.util.*;



public class Praties {

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(45);
		list.add(66);
		list.add(90);
		list.add(45);
		list.add(90);
		list.add(90);
		
		System.out.println(list);
		System.out.println(list);
		
		
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if( list.get(i).equals(list.get(j))) {
					//System.out.println(list.get(i));
					
				}
				System.out.println(list.get(i));
			}
		}
		
		
		
		
	
	}
	
	
}
