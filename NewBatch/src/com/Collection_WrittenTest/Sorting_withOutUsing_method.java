package com.Collection_WrittenTest;

import java.util.*;
//8.	Write a program to sort ArrayList by decending without using sort method and without converting into array.

public class Sorting_withOutUsing_method {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("kalamb");
		list.add("kaj");
		list.add("washi");
		list.add("umarga");
		list.add("tuljapur");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0)

				{
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
	}

}
