package com.String;

public class PalimdromUsingStringBuffer {

	public static void main(String[] args) {

		String str = ("NAMAN");

		String find = "";

		while (str != "") {

			for (int i = str.length() - 1; i >= 0; i--) {

				find = find + str.charAt(i);
			}
		}

		if (find.equals(str))
			System.out.println("Palindrome");

		else
			System.out.println("Not Palindrome");

	}

}
