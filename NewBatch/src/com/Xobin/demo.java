package com.Xobin;

import java.util.*;

public class demo {
	public static boolean checkAnagram(String first, String second) {
		String inputString = first.toLowerCase();
		String inputString1 = second.toLowerCase();
		
		boolean isAnagram = false;

		char ch[] = inputString.toCharArray();
		char ch1[] = inputString1.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		return Arrays.equals(ch, ch1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String first = sc.next();
		System.out.println("Enter the second string: ");
		String second = sc.next();

		boolean isAnagram = checkAnagram(first, second);
		System.out.println(isAnagram);
	}
}