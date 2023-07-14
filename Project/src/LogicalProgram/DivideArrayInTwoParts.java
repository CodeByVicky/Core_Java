package LogicalProgram;

import java.util.Arrays;

//8.	Divide array in two parts and reverse the two parts. 
//e.g. if array is { 1,2,3,4,5,6,} result should be { 4,5,6, 1,2,3} 
//if array contains odd elements e.g. { 1,2,3,4,5,6,7} result should be {5,6,7,4,3,2,1}

public class DivideArrayInTwoParts {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6,7 };

		if (arr.length % 2 == 0) {

			for (int i = 0; i < arr.length / 2; i++) {

				int temp = arr[arr.length / 2 + i];
				arr[arr.length / 2 + i] = arr[i];
				arr[i] = temp;
			}
			System.out.println(Arrays.toString(arr));
		} else {
			int temp2 = arr[arr.length - 1];

			for (int i = 0; i < arr.length / 2; i++) {
				int temp1 = arr[arr.length / 2 + 1 + i];

				int temp = arr[i];

				arr[arr.length - 1 - i] = temp;

				arr[i] = temp1;

			}
			arr[2] = temp2;
			System.out.println(Arrays.toString(arr));
		}
	}
}
