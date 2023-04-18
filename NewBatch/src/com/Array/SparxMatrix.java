package com.Array;

public class SparxMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 1, 0, 3, 4 }, { 0, 8, 0, 4 }, { 0, 5, 0, 0, },
				{ 0, 0, 9, 0 } };

		int zeros = 0;
		int non_zeros = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0)
					zeros++;
				else
					non_zeros++;
			}
		}
		System.out.println("zeros" + " :" + zeros + " " + "non_zeros" + ":"
				+ non_zeros);
		if (zeros > non_zeros)
			System.out.println("sparx");
		else
			System.out.println("not");
	}

}
