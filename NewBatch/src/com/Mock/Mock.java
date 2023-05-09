package com.Mock;

public class Mock {
	String arr[];

	public void Show(String arr[]) {

		this.arr = arr;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() < arr[j].length()) {
					String temp = "";
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		for (String s : arr) {
			System.out.print(s + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {

		String[] arr = { "pune", "kamlab", "kaj", "latur" };

		Mock m = new Mock();
		m.Show(arr);

	}

}
