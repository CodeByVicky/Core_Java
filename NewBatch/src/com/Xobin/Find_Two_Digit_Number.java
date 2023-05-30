package com.Xobin;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_Two_Digit_Number {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner can = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("enter value");
			list.add(can.nextInt());
		}
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) / 10 != 0) {

				count++;
			}

		}
		System.out.println(count);

	}

}
