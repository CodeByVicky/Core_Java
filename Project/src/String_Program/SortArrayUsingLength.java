package String_Program;

import java.util.Arrays;

public class SortArrayUsingLength {

	public static void main(String[] args) {
		String arr[] = { "c", "is", "good", "to", "learn" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() < arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
