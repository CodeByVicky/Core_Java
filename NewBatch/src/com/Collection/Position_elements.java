package com.Collection;

import java.util.ArrayList;

public class Position_elements {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(12);
		list.add(67);
		list.add(67);
		list.add(90);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+"--->"+list.get(i));

		}

	}

}
