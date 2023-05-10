package com.HashMap_Object;

import java.util.*;

// Create a Linkedhashmap which contains Emp is keys and Emp id is
//values.

class Emp {
	int eid;
	String name;
	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}
	

}

public class LinkedList_emp {

	public static void main(String[] args) {
		LinkedHashMap<Emp, Integer> map = new LinkedHashMap();

		map.put(new Emp(510,"tony"), 101);
		map.put(new Emp(55, "peter"),102);
		
		for(Map.Entry<Emp, Integer>m:map.entrySet()) {
			System.out.println(m);
		}

	}

}
