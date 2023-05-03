package com.Collection_Object;

import java.util.*;

class Location {
	int l_id;
	String l_name;

	public Location(int l_id, String l_name) {
		this.l_id = l_id;
		this.l_name = l_name;
	}

	public String toString() {
		return l_id + " " + l_name;
	}
}

class Employeer {
	int e_id;
	String e_name;
	Location l;

	public Employeer(int e_id, String e_name, Location l) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.l = l;
	}

	public String toString() {
		return e_id + " " + e_name + " " + l;

	}

	public static void show(ArrayList<Employeer> list) {
		
		List<Employeer> employeesInSameCity = new ArrayList<>();
		 for (Employeer e : list) {
	            for (Employeer other : list) {
	                if (e != other && e.l.l_name.equals(other.l.l_name)) {
	                    employeesInSameCity.add(e);
	                    break;
	                }
	            }
	        }
		 System.out.println("Employees who belong to the same city:");
	        for (Employeer e : employeesInSameCity) {
	            System.out.println("- " + e.e_name + " (" + e.l.l_name + ")");
	        }
		
	}

}

public class Employee_containment_loction {

	public static void main(String[] args) {

		ArrayList<Employeer> list = new ArrayList<Employeer>();

		list.add(new Employeer(101, "vicky", new Location(51, "pune")));
		list.add(new Employeer(102, "kedar", new Location(52, "pune")));
		list.add(new Employeer(103, "nikhi", new Location(53, "kalamb")));
		list.add(new Employeer(104, "viren", new Location(54, "pune")));
		list.add(new Employeer(105, "prasad", new Location(55, "lamb")));

		System.out.println(list);

		System.out.println("88888888888888888888888888888888");
		Employeer.show(list);

	}

}
