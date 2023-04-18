package WritternTest;

import java.util.Scanner;

public class FactorialToSum {

	public static void main(String[] args) {
		// 15)1!+2!+3!+4!...n WAP java program to find sum.
		
		int i, fact = 1, num;
		Scanner can = new Scanner(System.in);
		System.out.println("enter number ");
		num = can.nextInt();

		for (i = 1; i <= num; i++){

			fact = fact * i;
	//		System.out.println(fact);

		}
		System.out.println(fact);




	}

}
