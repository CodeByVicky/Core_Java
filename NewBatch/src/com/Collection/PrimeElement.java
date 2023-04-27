package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeElement {

	public void show(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 2; j < list.get(i); j++) {
				if (list.get(i) % j == 0) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println(list.get(i));
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		PrimeElement pr = new PrimeElement();
		pr.show(list);

	}

}
