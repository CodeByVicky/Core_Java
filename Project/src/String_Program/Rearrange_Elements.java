package String_Program;

import java.util.Arrays;

//10,3,5,21,22,0,0,0
public class Rearrange_Elements {

	public static void main(String[] args) {

		int arr[] = { 10, 0, 3, 5, 0, 21, 0, 22 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp=arr[i];
				for (int j = i; j < arr.length - 1; j++) {

					arr[j] = arr[j + 1];
				}

				arr[arr.length - 1] = temp;

			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
