package com.Xobin;
import java.util.*;

public class CaseChange {

	public static void main(String[] args) {

		Scanner can=new Scanner(System.in);
		System.out.println("enter String");
		String s = can.next();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

				System.out.print((char) (s.charAt(i) - 32));
			} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				System.out.print((char) (s.charAt(i) + 32));
			}

		}

	}

}
