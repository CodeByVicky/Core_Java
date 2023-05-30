package com.Xobin;

import java.util.*;

public class Adjustment_elements_vikcy {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers (separated by spaces):");
		String input = scanner.nextLine();
		String[] arr = input.split(" ");

	

		for (int i = 0; i < arr.length - 1; i += 2) {

			int sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr[i + 1]);
			System.out.println(sum);
		}

	}

}
