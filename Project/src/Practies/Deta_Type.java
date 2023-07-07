package Practies;

import java.util.Scanner;

public class Deta_Type {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);

		System.out.println("enter 1 digit");
		float a = can.nextInt();

		System.out.println("enter 2 digit");
		float b = can.nextInt();

		int c =(int) (a / b);

		System.out.println("result  c=: " + c);

	}

}
