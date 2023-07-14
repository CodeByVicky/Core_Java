package LogicalProgram;

import java.util.Arrays;

//1.	Find a continuous sub array whose sum is equal to given number. 

//e.g. if given array is { 12 ,4, 2, 10 , 5 , 1 } and
//given number is 16 then sum of subarray { 4,2,10} and {10, 5,1} is equal to given number.

public class ContinuousSubArray {

	public static void main(String[] args) {

		int arr[] = { 12, 4, 2, 10, 5, 1 };
		int arr1[] = new int[3];
		int arr2[] = new int[3];

		int num = 16;
		int count = 1;
		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {

					if (arr[i] + arr[j] + arr[k] == num) {

						if (count <= 3) {

							arr1[a] = arr[i];

							a++;
							count++;
							arr1[a] = arr[j];

							a++;
							count++;

							count++;
						} else {

							arr2[b] = arr[i];
							b++;
							arr2[b] = arr[j];
							b++;
							arr2[b] = arr[k];
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
