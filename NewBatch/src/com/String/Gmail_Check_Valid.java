package com.String;
//Accept email_id from user and check valid or not(should contain @,.,digit)

public class Gmail_Check_Valid {

	public static void show(String s) {
		int count = 0, count1 = 0, count2 = 0;
		boolean find = false;
		boolean sp = false;

		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) >= '0' && s.charAt(i) <= '8')
					|| (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) == '.' || s.charAt(i) == '@')) {
				find = true;
				count++;

			}

		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				count1++;

			}

		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@') {
				count2++;

			}

		}
		// System.out.println(count1);

		// System.out.println(count2);

		if (find == true && count == s.length() && count1 == 1 && count2 == 1) {
			System.out.println("Sucessful.....\nYour Valid email id !!!");
		} else {
			System.out.println("Invalid email id.....\nPlease enter valid email id!!!");
		}

	}

	public static void main(String[] args) {
		String s = "thevicky@gamil.com";

		Gmail_Check_Valid.show(s);
	}

}
