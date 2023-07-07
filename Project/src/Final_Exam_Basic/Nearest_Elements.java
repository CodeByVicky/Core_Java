package Final_Exam_Basic;

import java.util.*;

public class Nearest_Elements {

	public static void main(String[] args) {
		int arr[] = { 4, 7, 23, 67, 8, 26 };
		Scanner can = new Scanner(System.in);
		System.out.println("enter number");
		int num = can.nextInt();
		boolean find = false;
		boolean last = false;
		boolean end = false;
		
	
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				System.out.println("elements present in array");
				find = true;
				break;
			}

		}
		if (find == false) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {

						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}

			System.out.println(Arrays.toString(arr));
			int max = 0, min = 0;
			int min1 = 0, max1 = 0;

			if (arr[0] > num) {
				System.out.println("Nearest number is:" + arr[0]);
				end = true;
			} else {
				for (int i = 0; i < arr.length; i++) {
					if (num < arr[i]) {
						max = arr[i];
						min = arr[i - 1];
						last = true;
						break;
					}
				}
			}

			// System.out.println(min + "-->" + max);

			min1 = num - min;
			max1 = max - num;

			System.out.println("--------------------");

			// System.out.println(min1);
			// System.out.println(max1);
			if (end == false) {
				if (last == false) {
					System.out.println("Nearest number is:" + arr[arr.length - 1]);
				} else if (min1 < max1) {
					System.out.println("Nearest number is:" + min);
				} else if (min1 == max1) {
					System.out.println("Both are Same:" + min + "and" + max);
				} else {
					System.out.println("Nearest number is:" + max);
				}
			}
		}

	}

}
