package com.Collection;

import java.util.*;

public class EvenElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

	
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.println(list.get(i));
			}
		}
		
		System.out.println("////////////////////////////////////////////////////");
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			
			Integer num=itr.next();
			if(num%2==0) {
				System.out.println(num);
			}
			
		}
	}

}
