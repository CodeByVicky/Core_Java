package Practies;

import java.util.*;

public class Switc_Statement_Calculator {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		int a, b, c;

		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");

		int num = can.nextInt();

		switch (num) {
		case 1:
			System.out.println("enter first number");
			a = can.nextInt();

			System.out.println("enter second number");
			b = can.nextInt();

			c = a + b;
			System.out.println("Addition: "+c);

			break;

		case 2:
			System.out.println("enter first number");
			a = can.nextInt();

			System.out.println("enter second number");
			b = can.nextInt();

			c = a - b;
			System.out.println("Substraction is:"+c);

			break;

		case 3:

			System.out.println("enter first number");
			a = can.nextInt();

			System.out.println("enter second number");
			b = can.nextInt();

			c = a * b;
			System.out.println("Multiplication: "+c);

			break;

		case 4:
			System.out.println("enter first number");
			a = can.nextInt();

			System.out.println("enter second number");
			b = can.nextInt();

			c = a / b;
			System.out.println("Division: "+c);

			break;

		default:
			System.out.println("Someting worng....Please enter correct number");
		}

	}
}
