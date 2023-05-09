package com.Xobin;

import java.util.*;

public class Array_Min_Max {

	public static void main(String[] args) {

		Scanner can = new Scanner(System.in);
		System.out.println("enter size");
		int arr[] = new int[can.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = can.nextInt();
		}

		int arr1[] = arr;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		int max = arr[arr.length - 1];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;

				}
			}

		}
		int min = arr1[arr1.length - 1];
		System.out.print(max + " " + min);

	}

}
