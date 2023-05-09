package com.HashMaping;
import java.util.*;
// WAP to copy all of the mappings from the specified HashMap to another
//map.
public class Copy_HashMap {

	public static void main(String[] args) {
	
		HashMap<Integer,String>list=new HashMap();
		
		list.put(1, "Home");
		list.put(2,"Room");
		list.put(3, "Hall");
		
		HashMap<Integer,String>list2=new HashMap();
		
		list2=list;
		
		for(Map.Entry<Integer, String> m:list.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
