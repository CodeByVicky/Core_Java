package com.Collection;

import java.util.*;

public class DublicateNumber {

	ArrayList<String> list2 = new ArrayList<String>();

	void show(ArrayList<String> list) {

		for (int i = 0; i < list.size(); i++) {
			boolean find = false;
			int count = 0;

			for (int j = i - 1; j >= 0; j--) {
				if (list.get(i) == list.get(j)) {
					find = true;
					break;
				}
			}

			if (find == false) {
				for (int k = i + 1; k < list.size(); k++) {
					if (list.get(i) == list.get(k)) {
						count++;
					}

				}

				if (count ==1) {
					//System.out.println(list.get(i));
					list2.add(list.get(i));
				}
			}

		}
		for(int i=0;i<list2.size();i++) {
		System.out.println(list2.get(i));
		}

	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("sun");
		list.add("mon");
		list.add("sun");
		list.add("tue");
		list.add("wed");
		list.add("mon");

		DublicateNumber du = new DublicateNumber();
		du.show(list);

	}

}
