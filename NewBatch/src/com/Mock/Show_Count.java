package com.Mock;

import java.util.*;
import java.util.Map.Entry;

class Location {
	int l_id;
	String l_name;

	public Location(int l_id, String l_name) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "Location [l_id=" + l_id + ", l_name=" + l_name + "]";
	}

}

class Department {
	int d_id;
	String d_name;
	Location l;

	public Department(int d_id, String d_name, Location l) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.l = l;
	}

	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", name=" + d_name + "]";
	}
	
	public static void shrch(ArrayList<Department> list) {
		HashMap<String, Integer> map = new HashMap();

		int count = 0;

		for (Department dep : list) {

			if (map.containsKey(dep.l.l_name)) {

				count++;
				map.put(dep.l.l_name, count + 1);
			}

			else
				map.put(dep.l.l_name, 1);

		}
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> d = it.next();
			System.out.println(d);
		}

	}

}

public class Show_Count {

	public static void main(String[] args) {

		ArrayList<Department> list = new ArrayList<>();

		list.add(new Department(1, "Hr", new Location(1001, "mumbai")));
		list.add(new Department(2, "It", new Location(1002, "banglore")));
		list.add(new Department(3, "Sales", new Location(1003, "mumbai")));
		list.add(new Department(4, "Sales", new Location(1004, "mumbai")));

	
		Department.shrch(list);
		
		// System.out.println(map);

		

	}

}
