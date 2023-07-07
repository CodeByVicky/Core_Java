package Final_Exam_Basic;

import java.util.Scanner;

public class Nearest_Number_new {

	public static void main(String[] args) {
		int arr[] = { 4, 7, 23, 67, 8, 26 };
		Scanner can = new Scanner(System.in);
		System.out.println("enter number");
		int num = can.nextInt();
		boolean find = false;
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				System.out.println("elements present in array");
				find = true;
				break;
			}

		}
	}
}
