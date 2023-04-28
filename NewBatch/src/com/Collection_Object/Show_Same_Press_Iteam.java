package com.Collection_Object;

import java.util.*;

class Item {
	int id;
	String name;
	int price;
	// ArrayList<Item> list;

	Item(){
		
		
		
	}
	Item(int id, String name, int price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + price;
	}

	void showSameItem(ArrayList<Item> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).price == list.get(j).price) {
					System.out.println(list.get(i).name + " " + list.get(j).name);
					// System.out.println(list.get(j).name);
				}
			}
		}
	}

	void sarch(ArrayList<Item> list) {
		Scanner can = new Scanner(System.in);
		System.out.println("enter sarch Product");
		String pro = can.next();
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(pro)) {
				count++;
				System.out.println(list.get(i).name + " " + "is available");
			}

		}

		if (count == 0) {
			System.out.println("product is not available");
		}
	}

}

public class Show_Same_Press_Iteam {

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList();

		list.add(new Item(1, "sope", 50));
		list.add(new Item(2, "oil", 100));
		list.add(new Item(2, "shampo", 50));

		Item it = new Item();

		it.showSameItem(list);
		System.out.println("////////////////////////////////");
		it.sarch(list);

	}

}
