package com.ArrayOfObject;

import java.util.Scanner;

public class StudentUsingSetterGetter {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	public static void main(String[] args) {

		StudentUsingSetterGetter arr[] = new StudentUsingSetterGetter[2];
		

		Scanner can = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			
			StudentUsingSetterGetter st = new StudentUsingSetterGetter();
			System.out.println("enter id");
			st.setId( can.nextInt());

			System.out.println("enter name");
			String name = can.next();
			
			
			//st.setId(id);
			st.setName(name);
			arr[i]=st;

			/*
			 * arr[i] = new StudentUsingSetterGetter();
			 * arr[i].setId(id);
			 * arr[i].setName(name);
			 */
		}
		
		 for (int i = 0; i < arr.length; i++) {
		  System.out.println(arr[i].getId()+" "+arr[i].getName()); }
		 
//		for(StudentUsingSetterGetter rt:arr) {
//			System.out.println(rt);
//		}
	}

}
