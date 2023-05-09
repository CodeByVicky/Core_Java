package com.HashMaping;
import java.util.*;
// WAP to get only the Keys from a HashMap.


public class ShowKey {

	public static void main(String[] args) {
		HashMap<Integer,String>list=new HashMap();
		
		list.put(1, "RCb");
		list.put(2, "CSK");
		list.put(3, "RR");

		
		for(Map.Entry<Integer, String>m:list.entrySet()) {
		//System.out.println(m.getKey());
		System.out.println(m.getValue());
		}
		
		Set<Integer> keys=list.keySet();
		for(Integer i:keys) {
			System.out.println(i);
		}
		
		for(String s:list.values()) {
			System.out.println(s);
		}
		
		for(Integer i:list.keySet()) {
			System.out.println(i);
		}
		for(Map.Entry<Integer, String> s:list.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

}
