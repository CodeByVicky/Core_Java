package String_Program;

public class Remove_Character {

	public static void main(String[] args) {

		String str = "CloudTeCh";

		char ch = 'C';

		removeChar(str, ch);

	}

	public static void removeChar(String str, char c) {

		String finalStr = "";

		int n = str.length();

		for (int i = 0; i < n; i++) {

			if (str.charAt(i) != c) {

				finalStr = finalStr + str.charAt(i);

			}

		}

		System.out.println(finalStr);

	}
}