package LogicalProgram;

import java.util.Scanner;

public class FibonacciSeriesSimple {

	public static void main(String[] args) {

		Scanner can = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = can.nextInt();

		if (num == 1) {
			System.out.println(0);
			;
		} else {
			int a = 0;
			int b = 1;

			System.out.print(a + "," + b + ",");

			for (int i = 2; i < num; i++) {
				int c = a + b;
				System.out.print(c + ",");
				a = b;
				b = c;
			}
		}
	}
}
