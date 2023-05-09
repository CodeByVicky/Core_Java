package com.Mock;

public class Mock2 {

	String s;

	Mock2(String s) {
		this.s = s;
	}

	public void show() {

		String temp = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
					&& s.charAt(i) != 'u') {

				temp = temp + s.charAt(i);

			}

		}
		s = temp;
		System.out.println(s);

	}

	public static void main(String[] args) {

		String s = "best in the world";

		Mock2 m = new Mock2(s);
		m.show();

	}

}
