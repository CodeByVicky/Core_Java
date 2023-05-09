package com.HashMaping;

import java.util.*;
// WAP to add elements to a HashMap using generics with Integer as Key
//and String as value. And 4 key-value entries.

public class Integer_String {

	public static void main(String[] args) {
		HashMap<Integer, String> list = new HashMap();

		list.put(1, "red");
		list.put(2, "blue");
		list.put(3, "black");
		list.put(4, "yellow");

		// System.out.println(list);

		for (Map.Entry<Integer, String> m : list.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Set myMap1 = list.entrySet();
		Iterator<Map.Entry<Integer, String>> it = myMap1.iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> m = it.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Set myMap = list.keySet();

		Iterator<Integer> itr = myMap.iterator();
		while (itr.hasNext()) {
			Integer str = itr.next();
			System.out.println(str + " " + list.get(str));
		}

	}

}
