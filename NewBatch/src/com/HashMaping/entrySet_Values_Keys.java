package com.HashMaping;
import java.util.*;

public class entrySet_Values_Keys {

	public static void main(String[] args) {
		HashMap<Integer,String>list=new HashMap();
		
		list.put(12, "car");
		list.put(14, "bike");
		list.put(56, "cycle");
		list.put(3, "train");
		
		
		for(Map.Entry<Integer,String> m:list.entrySet()) {
			System.out.println(m.getValue());
		}
		
		System.out.println("88888888888888888888888");
		
		
		for(Map.Entry<Integer,String> m:list.entrySet()) {
			System.out.println(m.getKey());
		}
		System.out.println("88888888888888888888888");
		
		for(Integer i:list.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("88888888888888888888888");
		
		for(String s:list.values()) {
			System.out.println(s);
		}
		
	}
}
