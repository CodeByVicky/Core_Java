package com.Array;

import java.util.Scanner;

class Marks {
	int marathi;
	int math;
	int hindi;
	static int per;

	Marks(int marathi, int math, int hindi) {
		this.marathi = marathi;
		this.math = math;
		this.hindi = hindi;
	}

	public String toString() {
		return marathi + " " + math + " " + hindi;
	}

	int percentage() {
		int total = marathi + math + hindi;
		per = (total * 100) / 300;
		return per;
	}

}

class Student {
	int id;
	String name;
	Marks mar;
	int per;
	int a, b, c;

	Student(int id, String name, Marks mar) {

		this.id = id;
		this.name = name;
		this.mar = mar;

	}

	public String toString() {

		return id + " " + name + " " + " " + mar;
	}

}

public class GotPercentage {

	public static void main(String[] args) {

		Student arr[] = new Student[2];

		Scanner can = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();

			System.out.println("please enter subject marks\n");

			System.out.println("enter mark in marathi");
			int a = can.nextInt();

			System.out.println("enter mark in mathematic");
			int b = can.nextInt();

			System.out.println("enter mark in hindi");
			int c = can.nextInt();

			arr[i] = new Student(id, name, new Marks(a, b, c));
		}
		for (Student s : arr) {
			int per = s.mar.percentage();

			if (per >= 60)
				System.out.println(s + " per= " + per);

		}

	}

}
