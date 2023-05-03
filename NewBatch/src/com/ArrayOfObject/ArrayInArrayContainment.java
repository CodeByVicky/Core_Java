package com.ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

 class Car {
	 String[] car;

	public Car(String[] car) {
		this.car = car;
	}

	public Car() {

	}

	public void show() {
		System.out.println(Arrays.toString(car));
	}

}

class ShowRoom extends Car {
	int id;
	String name;

	ShowRoom(int id, String name) {
		//super();
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + " " + name ;
	}
}

public class ArrayInArrayContainment {

	public static void main(String[] args) {

		Scanner can = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = can.nextInt();

		ShowRoom[] arr = new ShowRoom[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();

			arr[i] = new ShowRoom(id, name);

		}

		System.out.println("enter size of names of cars");
		int len = can.nextInt();

		// String [] c_name = new String[len];
		Car[] arr1 = new Car[len];

		String car[] = new String[1];
		for (int j = 0; j < car.length; j++) {
			System.out.println("enter car name");
			car[j] = can.next();
			arr1[j] = new Car(car);
		}

		for (ShowRoom s : arr) {
			System.out.println(s);
		}

	}

}
