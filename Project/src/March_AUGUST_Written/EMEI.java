package March_AUGUST_Written;

public class EMEI {

	public static void main(String[] args) {

		String str = "490154203237518";

		int find = 0, find1;
		int num1 = 0;
		int total = 0;
		int total1 = 0, total2 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {

				find1 = Character.getNumericValue(str.charAt(i));

				total1 = total1 + find1;

			} else {

				find = Character.getNumericValue(str.charAt(i));

				int f = find + find;

				while (f > 0) {
					int num = f % 10;
					num1 = num1 + num;

					f = f / 10;

				}

			}

		}
		total2 = total2 + num1;
		total = total1 + total2;
		// System.out.println(total);

		if (total % 10 == 0) {
			System.out.println("hence the given IMEI number is Valid");
		} else
			System.out.println("hence the given IMEI number is InValid");
	}
}