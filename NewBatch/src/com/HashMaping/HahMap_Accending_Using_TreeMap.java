package com.HashMaping;
import java.util.*;
import java.util.Map.Entry;

public class HahMap_Accending_Using_TreeMap {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap();
		
		map.put(4, "four");
		map.put(9, "nine");
		map.put(2, "two");
		map.put(5, "five");
		map.put(1, "one");
		
		TreeMap<Integer,String>tmap=new TreeMap(map);
	
		
		//System.out.println(map);
		
		Set<Map.Entry<Integer,String>> set=tmap.entrySet();
		
		Iterator<Map.Entry<Integer, String>>itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> find=itr.next();
			
			System.out.println(find.getKey()+" "+find.getValue());
			
		}
		
	}

}
