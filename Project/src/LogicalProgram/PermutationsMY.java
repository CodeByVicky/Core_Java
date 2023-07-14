package LogicalProgram;
//JSP-
//JPS-
//SJP-
//SPJ-
//PSJ-
//PJS-

import java.util.Arrays;

public class PermutationsMY {

	public static void main(String[] args) {

		int count = 0;
		String str = "JSP";
		char arr[];
		arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));// JSP //SPJ
		for (int j = 0; j <= 2; j++) {

			for (int i = 0; i < arr.length; i++) {
				if (j == 0 || j == 1) {
					count++;
					if (i == 0) {

						char temp = arr[i + 1];
						arr[i + 1] = arr[i + 2];
						arr[i + 2] = temp;                       // SPJ
						System.out.println(Arrays.toString(arr));// JPS //PSJ
					}
					if (j == 0) {
						if (i == 1) {
							char temp2 = arr[2];
							arr[i + 1] = arr[i];
							arr[i] = arr[i - 1];
							arr[i - 1] = temp2;
							System.out.println(Arrays.toString(arr));// SJP //SPJ //PJS
						}
					}
				} else {
					count++;
					char temp1 = arr[0];

					arr[0] = arr[1];
					arr[1] = temp1;
					System.out.println(Arrays.toString(arr));

					char temp2 = arr[2];
					arr[2] = arr[1];
					arr[1] = temp2;
					System.out.println(Arrays.toString(arr));

					if (count == 7)
						break;

				}

			}

		}
	}

}
