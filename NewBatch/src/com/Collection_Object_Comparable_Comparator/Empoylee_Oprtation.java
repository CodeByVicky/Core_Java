package com.Collection_Object_Comparable_Comparator;

import java.util.*;

class Profile {
	String state;
	String country;

	public Profile(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return state + " " + country;
	}

}

class Empp implements Comparable<Empp> {
	int id;
	String name;
	Profile pro;

	Empp(int id, String name, Profile pro) {
		this.id = id;
		this.name = name;
		this.pro = pro;
	}

	public String toString() {
		return id + " " + name+"  ["+pro;
	}

	@Override
	public int compareTo(Empp e) {
		// return this.id-e.id;
		// return e.id-this.id;

		// return e.name.compareTo(this.name);

		if (this.name == e.name) {
			return e.id - this.id;
		} else {
			return this.name.compareTo(e.name);
		}

	}

}

public class Empoylee_Oprtation {

	public static void main(String[] args) {
		ArrayList<Empp> list = new ArrayList<>();

		list.add(new Empp(101, "vicky", new Profile("guj", "india")));
		list.add(new Empp(103, "prashant", new Profile("maha", "england")));
		list.add(new Empp(102, "nikhi", new Profile("puj", "america")));
		list.add(new Empp(104, "vicky", new Profile("mp", "pak")));

		
		Collections.sort(list);

		for (Empp em : list) {
			System.out.println(em);
		}
		System.out.println("88888888888888888888888888888888888");
		Collections.sort(list, new countryShow());

		for (Empp em : list) {
			System.out.println(em);
		}
		
	}

}

class countryShow implements Comparator<Empp>{
	
	public int compare(Empp e1,Empp e2) {
		return e1.pro.country.compareTo(e2.pro.country);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
