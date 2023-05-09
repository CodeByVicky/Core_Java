package com.HashMaping;

import java.util.*;

public class TreeMap_Desingding {

	public static void main(String[] args) {

		TreeMap<String, String> list = new TreeMap(Collections.reverseOrder());
		list.put("Name", "vicky");
		list.put("Specialisation", "E&tc");
		list.put("College", "MMCOE");

		for (Map.Entry<String, String> m : list.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}