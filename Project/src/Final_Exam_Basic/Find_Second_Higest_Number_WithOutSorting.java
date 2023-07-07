package Final_Exam_Basic;
//2) Second highest number of array without sorting

public class Find_Second_Higest_Number_WithOutSorting {

	public static void main(String[] args) {
		int arr[] = { 3, 12, 6, 8, 2, 5, 7, 10, 15 };
		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];

			}

		}
		// System.out.println(temp);
		int temp2 = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < temp2 && arr[i] != temp) {
				temp2 = arr[i];

			}

		}
		System.out.println(temp2);

	}
}
