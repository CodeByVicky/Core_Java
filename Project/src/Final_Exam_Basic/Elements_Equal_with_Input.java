package Final_Exam_Basic;

import java.util.*;

public class Elements_Equal_with_Input {

	void show(int arr[]) {
		Scanner can = new Scanner(System.in);
		System.out.println("enter elements");
		int ele = can.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = i + 2; k < arr.length; k++) {
					for (int l = i + 3; l < arr.length; l++) {
						if (arr[i] + arr[j] + arr[k] + arr[l] == ele) {
							System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "+" + arr[l] + "-->"
									+ (arr[i] + arr[j] + arr[k] + arr[l]));
						}
					}

					if (arr[i] + arr[j] + arr[k] == ele) {
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "-->" + (arr[i] + arr[j] + arr[k]));
					}
				}
				if (arr[i] + arr[j] == ele) {
					System.out.println(arr[i] + "+" + arr[j] + "-->" + (arr[i] + arr[j]));

				}

			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		Elements_Equal_with_Input el = new Elements_Equal_with_Input();
		el.show(arr);
	}

}
