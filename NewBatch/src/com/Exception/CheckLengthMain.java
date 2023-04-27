package com.Exception;

class vicky extends Throwable {
	vicky() {
		System.out.println("this is my name");
	}
}

public class CheckLengthMain {

	void check(String str) throws vicky {

		if (str.length() < 8) {
			throw new vicky();
		}

		else {
			System.out.println("length is correct");
		}

	}

	public static void main(String[] args) {

		String str = "best";
		CheckLengthMain length = new CheckLengthMain();
		try {
			length.check(str);
		} catch (vicky e) {
			System.out.println(e);
		}
	}

}
