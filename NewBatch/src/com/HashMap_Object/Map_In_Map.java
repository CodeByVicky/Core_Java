package com.HashMap_Object;
import java.util.*;
import java.util.Map.Entry;

//Create a Map which contain Integer as key and Another Map as Value
//another Map Contain Emp as Key and Integer as value Print the Map
//using Iterator.

class Empp{
	String name;
	int salary;
	public Empp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empp [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Map_In_Map {

	public static void main(String[] args) {
		HashMap<Integer,Map<Empp, Integer>>map2=new HashMap<>();
		
		HashMap<Empp,Integer>map=new HashMap<>();	
		map.put(new Empp("john",101), 1);
		map.put(new Empp("raju",9000), 22);
		
		map2.put(101, map);
		
		
		HashMap<Empp,Integer>map5=new HashMap<>();
		map5.put(new Empp("babu bhaya",66), 67);
		map2.put(3, map5);
		
//		map.put(new Empp("vicky",90000), 67);
//		map.put(new Empp("pratik",90909), 90);
//		map2.put(102, map);
		
//		for(Map.Entry<Integer, Map<Empp,Integer>>m:map2.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue() );
//		}
//		
		 Iterator< Map.Entry<Integer, Map<Empp, Integer>>> it = map2.entrySet().iterator();
		

		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
//		Set s = map2.keySet();
//		
//		Iterator<Integer,Map<Empp,Integer>>itr=s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		Iterator<Map.Entry<Integer, Map<Empp,Integer>>>itr=map2.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
