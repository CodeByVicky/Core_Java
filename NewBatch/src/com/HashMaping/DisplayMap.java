package com.HashMaping;

import java.util.*;

public class DisplayMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap();

		hm.put("pune", 12);
		hm.put("beed", 24);
		hm.put("dharashiv", 25);
		hm.put("latur", 23);

		System.out.println("Type-1................................................................");

		System.out.println(hm);
		System.out.println("88888888888888888888888888888888");

		System.out.println("Type-2................................................................");

		for (Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("88888888888888888888888888888888");

		System.out.println("Type-3.................................................................");

		Set s = hm.keySet();
		System.out.println(s);

		// System.out.println("----------------------------------------------------------------");
		// Set s1=hm.entrySet();
		// System.out.println(s1);

		System.out.println("88888888888888888888888888888888");

		System.out.println("Type-4.................................................................");
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + " " + hm.get(str));
		}

		System.out.println("88888888888888888888888888888888");

		System.out.println("Type-5.................................................................");

		Set mymap = hm.entrySet();
		Iterator<Map.Entry<String, Integer>> it = mymap.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> m = it.next();

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
