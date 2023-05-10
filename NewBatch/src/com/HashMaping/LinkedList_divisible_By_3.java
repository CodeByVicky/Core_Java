package com.HashMaping;

import java.util.*;

//Create a Linkedhashmap<int,String> where key is integers 1 to 10 and
//string is number in words.Remove entry for which number is divisible by 3

public class LinkedList_divisible_By_3 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> list = new LinkedHashMap<>();

		list.put(1, "one");
		list.put(2, "two");
		list.put(3, "three");
		list.put(4, "four");
		list.put(5, "five");
		list.put(6, "six");
		list.put(7, "seven");
		list.put(8, "eight");
		list.put(9, "nine");
		list.put(10, "ten");

		list.entrySet().removeIf(entry -> entry.getKey() % 3 == 0);
		System.out.println(list);

		System.out.println("88888888888888888888888888888888888888888888888888");

//		for (Integer key : list.keySet()) {
//			list.remove(key % 3 == 0, list);
//			System.out.println(key);
//		}
		System.out.println("*************************************************");

		
		for(Map.Entry<Integer ,String>m:list.entrySet()) {
			list.remove(m.getKey()%3==0);
				System.out.println();
			}
		
		
		
		
		System.out.println(list);
	}

}
