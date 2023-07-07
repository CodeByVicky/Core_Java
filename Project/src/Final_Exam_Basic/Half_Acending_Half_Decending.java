package Final_Exam_Basic;
//Half asc and half desc in array

public class Half_Acending_Half_Decending {

	public static void main(String[] args) {
		int arr[] = { 3, 12, 6, 8, 2, 5, 7, 10, 15, 4 };

		int acc[] = new int[arr.length];
		int dce[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			// System.out.println(arr[i]);
			acc[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			// System.out.println(arr[i]);
			dce[i] = arr[i];
		}

		for (int i : acc) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i : dce) {
			System.out.print(i + " ");
		}

		int[] half;

		if (arr.length % 2 == 0) {
			half = new int[arr.length];
		} else {
			half = new int[arr.length - 1];
		}

		for (int i = 0; i < acc.length / 2; i++) {
			half[i] = acc[i];
		}
		int a = acc.length / 2;

		for (int i = 0; i < dce.length / 2; i++) {
			half[a] = dce[i];
			a++;
		}

		System.out.println();
		for (int i : half) {
			System.out.print(i + " ");
		}
	}

}
