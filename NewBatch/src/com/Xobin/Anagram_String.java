package com.Xobin;

import java.util.Arrays;

public class Anagram_String {

	public static boolean sortString(String inputString, String inputString2) {

		char ch[] = inputString.toCharArray();
		char ch1[] = inputString2.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		boolean find = Arrays.equals(ch, ch1);

		if (find) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		String first = "Peeter";
		String inputString = first.toLowerCase();

		String Second = "Keeper";
		String inputString2 = Second.toLowerCase();

		boolean outputString = sortString(inputString, inputString2);

		System.out.println(outputString);

	}
}