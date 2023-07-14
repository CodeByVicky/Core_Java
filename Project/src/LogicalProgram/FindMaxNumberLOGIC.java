package LogicalProgram;

import java.util.Arrays;

public class FindMaxNumberLOGIC {

	public static void main(String[] args) {

		int arr[] = { 7, 1, 4,8 };
		int num = 0;

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int b = 1;


		for (int i = 0; i < arr.length; i++) {
			b = b * 10;
			num += b * arr[i];

			

		}
		num=num/10;
		System.out.println(num);
	}

}
