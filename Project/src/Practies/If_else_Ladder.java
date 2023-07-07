package Practies;

import java.util.*;

public class If_else_Ladder {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);

		System.out.println("enter first subject mark");
		int a = can.nextInt();

		System.out.println("enter second subject mark");
		int b = can.nextInt();

		System.out.println("enter third subject mark");
		int c = can.nextInt();

		int total = a + b + c;

		int ave = total / 3;

		int per = (total * 100) / 300;

		System.out.println("Percentage is:" + per);

		if (per >= 90) {
			System.out.println("A+");
			
		} else if (per < 90 && per >= 80) {
			System.out.println("A");
			
		} else if (per < 80 && per >= 70) {
			System.out.println("B+");
			
		} else if (per < 70 && per >= 35) {
			System.out.println("B");
			
		} else {
			System.out.println("Fail");
		}

	}

}
