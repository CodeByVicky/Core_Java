package com.Xobin;

import java.util.*;

public class Remove_duplicate_from_Arryalist {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Scanner can = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("enter value");
			list.add(can.nextInt());
		}
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
				if (count == 1) {
					list.remove(i);
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
