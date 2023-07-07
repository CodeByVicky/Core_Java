package Collection_Practies;

import java.util.*;


public class HashTable_Practies {

	public static void main(String[] args) {
		Hashtable<Integer, String> list = new Hashtable<>();

		list.put(1, "vikcy");
		list.put(2, "riyanshi");
		list.put(3, "kavi");
		list.put(106, "rahul");
		list.put(117, "d");
		
		for(Map.Entry itr: list.entrySet()){
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
	}

}
