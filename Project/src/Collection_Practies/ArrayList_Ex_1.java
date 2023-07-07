package Collection_Practies;

import java.util.*;

public class ArrayList_Ex_1 {
	void show(ArrayList<Integer> list) {
		list.add(12);
		list.add(23);
		list.add(34);
		list.add(34);
		//list.add(null);
		list.add(1);
		
		for(Integer i:list) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		ArrayList_Ex_1 ar = new ArrayList_Ex_1();
		ar.show(list);

		HashSet<Integer>list1=new HashSet<>(list);
		LinkedHashSet<Integer>list3=new LinkedHashSet<>(list);
		TreeSet<Integer>list4=new TreeSet<>(list);
		System.out.println(list1);
		System.out.println(list3);
		System.out.println(list4);
	}

}
