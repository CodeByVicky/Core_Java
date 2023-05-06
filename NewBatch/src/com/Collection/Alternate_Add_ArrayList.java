package com.Collection;

import java.util.*;

public class Alternate_Add_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(12);
		list1.add(5);
		list1.add(18);
		list1.add(50);
		list1.add(100);

		ArrayList<Integer> list2 = new ArrayList<>();

		list2.add(7);
		list2.add(19);
		list2.add(1);

		int h = 0;
		int l = 0;
		
		int a=list1.size()-list2.size();

		System.out.println(a);
		
		
		ArrayList<Integer> list = new ArrayList<>();

		if (list1.size() == list2.size()) {

			for (int i = 0; i < list1.size(); i++) {

				list.add(list1.get(h));

				h++;

				list.add(list2.get(l));

				l++;

			}
		}
		
		
		else if (list1.size() > list2.size()) {

			for (int i = 0; i < list1.size(); i++) {

				if (i==list1.size()-a) {
					for (int j = 0; j < list1.size()-list2.size(); j++) {
						
						list.add(list1.get(h));
						
						h++;
						
					}
					
				} else {

					list.add(list1.get(h));
					

					h++;

					list.add(list2.get(l));

					l++;
				}

			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
