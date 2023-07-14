package LogicalProgram;

public class CutNumber {

	public static void main(String[] args) {
		int num = 63919;
		int temp = num;

		int res1 = 1;
		int res2 = 1;
		int res3 = 1;

		int find = num / 100;
		int tfind = find;

		while (find > 0) {
			int val = find % 10;
			res1 *= val;
			find /= 10;
		}

		int find1 = num % 1000;
		int tfind1 = find1;

		while (find1 > 0) {
			int val = find1 % 10;
			res2 *= val;
			find1 /= 10;
		}
		int find2 = num / 10;

		int find3 = find2 % 1000;
		int tfind3 = find3;

		while (find3 > 0) {
			int val = find3 % 10;
			res3 *= val;
			find3 /= 10;
		}

	

		if (res1 > res2 && res1 > res3)
			System.out.println(tfind + "-->" + res1);
		else if (res2 > res1 && res2 > res3)
			System.out.println(tfind1 + "-->" + res2);
		else
			System.out.println(tfind3 + "-->" + res3);

	}

}
