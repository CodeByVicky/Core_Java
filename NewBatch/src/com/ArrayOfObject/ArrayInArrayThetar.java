package com.ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

class Thetar {
	String name;
	int scr;
	String[] sc;

	Thetar(String name, int scr, String[] sc) {
		this.name = name;
		this.scr = scr;
		this.sc = sc;
	}

	public String toString() {
		return name + " " + scr + " " + Arrays.toString(sc);
	}
}

public class ArrayInArrayThetar {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = can.nextInt();

		Thetar[] arr = new Thetar[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter name");
			String name = can.next();

			System.out.println("enter no of screen ");
			int scr = can.nextInt();

			String[] sc = new String[scr];

			for (int j = 0; j < sc.length; j++) {
				sc[j] = can.next();
			}

			arr[i] = new Thetar(name, scr, sc);
		}

		for (Thetar t : arr) {
			System.out.println(t);
		}
		can.close();
	}

}
