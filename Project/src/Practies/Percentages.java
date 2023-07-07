package Practies;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		System.out.println("enter 1 subject marks");
		int a = can.nextInt();

		System.out.println("enter 2 subject marks");
		int b = can.nextInt();

		System.out.println("enter 3 subject marks");
		int c = can.nextInt();

		int total = a + b + c;

		int avg = total / 3;

		System.out.println("average is:" + avg);

		int per = ((total * 100) / 300);
		System.out.println("percentage is:" + per);

		if (per >= 35) {
			System.out.println("Pass");
		} else
			System.out.println("Fail");

	}

}
