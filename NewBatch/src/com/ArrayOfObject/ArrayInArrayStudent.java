package com.ArrayOfObject;

import java.util.*;

class Student1 {
	int id;
	String name;
	int[] mark;

	Student1(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.mark = marks;
	}

	public String toString() {
		return id + " " + name + " " + Arrays.toString(mark);
	}
}

public class ArrayInArrayStudent {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);

		System.out.println("enter length of array");
		int size = can.nextInt();
		Student1[] arr = new Student1[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();

			System.out.println("enter length of array");
			int len = can.nextInt();

			int[] marks = new int[len];

			System.out.println("enter mark");

			for (int j = 0; j < marks.length; j++) {
				marks[j] = can.nextInt();
			}
			arr[i] = new Student1(id, name, marks);
		}

		for (Student1 s : arr) {
			System.out.println(s);
		}
		can.close();
	}

}
