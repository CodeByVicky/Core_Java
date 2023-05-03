package com.ArrayOfObject;

import java.util.*;

class Marks{
	int mark1;
	int mark2;
	int mark3;
	
	
	Marks(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	public String toString () {
		return mark1+" "+mark2+" "+mark3;
	}
	
}

class Student {
	int id;
	String name;
	Marks mr;

	Student(int id, String name,Marks mr) {
		this.id = id;
		this.name = name;
		this.mr=mr;
	}
	
	public String toString() {
		return id+" "+name+" "+mr;
	}

}

public class ArrayOfObjectContainment {

	public static void main(String[] args) {

		Student arr[] = new Student[2];

		Scanner can = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();
			
			System.out.println("enter mark1");
			int mark1 = can.nextInt();
			
			System.out.println("enter mark2");
			int mark2 = can.nextInt();
			
			System.out.println("enter mark3");
			int mark3 = can.nextInt();
			

			arr[i] = new Student(id, name,new Marks(mark1,mark2,mark3));

		}

		for (Student s : arr) {
			System.out.println(s);
		}

	}

}