package com.Constructor;

import java.util.Scanner;

public class OopsAssignment {

	void box(int a, int b, int c) {
		int volume = a * b * c;
		System.out.println("volume is :" + volume);
	}

	void areaOfRectangle(int a, int b) {
		int area = a * b;
		System.out.println("area of rectangle is :" + area);

	}

	void percentage(int mar, int hin, int math, int bio, int che) {
		int total = mar + hin + math + bio + che;
		int per = (total * 100) / 500;
		System.out.println("percentage is :" + per + "%");
	}
	
	void national(String count){
		
		switch (count){
		
		case "india":System.out.println("National game of India is Hockey");
		break;
		
		case "china":System.out.println("National game of China is Table Tennis");
		break;
		
		case "bangladesh":System.out.println("National game ofBangladesh is Kabaddi");
		break;
		
		case "italy":System.out.println("National game of Italy is Football");
		break;
		
		case "united States":System.out.println("National game of United States is Baseball");
		break;
		
		default:System.out.println("enter volid country name");
		}
		
	}

	public static void main(String[] args) {
		// )Create class Box and calculate the volume of box
		// volume=length x width x height

		Scanner can = new Scanner(System.in);
		System.out.println("Enter length");
		int a = can.nextInt();

		System.out.println("Enter width");
		int b = can.nextInt();

		System.out.println("Enter height");
		int c = can.nextInt();

		OopsAssignment x = new OopsAssignment();
		x.box(a, b, c);

		System.out.println("----------------------------------");
		x.areaOfRectangle(a, b);

		System.out.println("----------------------------------");

		// create student class assign marks and calculate the percentage and
		// print the result 1st class,2nd class etc.
		System.out.println("Enter five subject marks");
		int mar = can.nextInt();
		int hin = can.nextInt();
		int math = can.nextInt();
		int bio = can.nextInt();
		int che = can.nextInt();

		x.percentage(mar, hin, math, bio, che);
		
		System.out.println("----------------------------------");
		
		/*
		 * National game of India is Hockey, China is Table Tennis, Bangladesh
		 * is Kabaddi, Italy is Football, United States is baseball. Write a
		 * Java program to read country name as user-input and to print the
		 * country’s national game. Use switch
		 */
		
		System.out.println("Enter country name");
		Scanner can1 = new Scanner(System.in);
		String count=can1.nextLine();
		count=count.toLowerCase();
		x.national(count);
	}

}
