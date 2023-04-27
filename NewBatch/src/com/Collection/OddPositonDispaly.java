package com.Collection;

import java.util.*;

public class OddPositonDispaly {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(90);
		list.add(456);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {

			itr.next();

			if (itr.hasNext()) {

				System.out.println(itr.next());

			}
		}

	}

}
