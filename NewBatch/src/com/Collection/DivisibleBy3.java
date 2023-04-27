package com.Collection;

import java.util.*;

public class DivisibleBy3 {

	public void show(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 3 == 0) {

				System.out.println(list.get(i));
			}
		}

	}

	public void remove(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 3 == 0) {

				list.remove(i);
			}
		}
		
		
	}
	
	
	public void intretorShow(ArrayList<Integer> list) {
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer num=(int)itr.next();
			
				if(num%3==0) {
					itr.remove();
					
				}
				
			
		}
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		
	}

	public static void main(String[] args) {

		DivisibleBy3 divi = new DivisibleBy3();

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		divi.show(list);
		divi.remove(list);
		
		
		System.out.println("8888888888888888888888888888888888888888888888");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

		
		
		
		System.out.println("8888888888888888888888888888888888888888888888");
		divi.intretorShow(list);
	}

}
