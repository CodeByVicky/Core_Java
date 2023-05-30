package com.Xobin;

import java.util.*;

public class Find_Sum_Of_LessElements {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner can=new Scanner(System.in);
		System.out.println("enter elements");
		
		for(int i=0;i<5;i++) {
			list.add(can.nextInt());
		}


		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					Integer temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}

		}

		for (int i = 0; i < 2; i++) {
			list.remove(0);
		}

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println(sum);
	}

}
