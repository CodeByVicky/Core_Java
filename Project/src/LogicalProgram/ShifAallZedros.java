package LogicalProgram;

import java.util.Arrays;

//4.	Shift all 0s in array to the end. E.g. if array is {1,5,0 ,6,0,4} output should be {1,5,6,4,0,0}
public class ShifAallZedros {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 0, 6, 0, 4 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				for (int j = i; j < arr.length - 1; j++) {

					arr[j] = arr[j + 1];

				}
				arr[arr.length - 1] = temp;

			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
