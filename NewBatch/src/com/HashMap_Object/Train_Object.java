package com.HashMap_Object;

import java.util.*;

class Train {
	int id;;
	String name;
	int set;

	public Train(int id, String name, int set) {
		super();
		this.id = id;
		this.name = name;
		this.set = set;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", set=" + set + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object o) {
		Train t=(Train) o;
		if(this.id==id && this.name.equals(t.name)){
			return true;
		}
		return false;
	}

}

public class Train_Object {

	public static void main(String[] args) {
	

	 HashMap<Train,Integer> hp= new HashMap<>();
	 hp.put(new Train(101,"Local",1000), 100);
	 hp.put(new Train(102,"Fast",800), 150);
	 hp.put(new Train(103,"Super_Fast",500), 200);
	 hp.put(new Train(101,"Local",1500), 90);
	 
	 
	 
	 System.out.println(hp);
	 
	 for(Map.Entry<Train, Integer>m:hp.entrySet()) {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
	
	}

}
