package com.Collection_Object;

import java.util.*;


class Employeee {
	int id;
	String name;
	int salary;

	Employeee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

	public static void Highest(ArrayList<Employeee> list) {
		//WAP to print Emp who have highest number of salary

		int max=list.get(0).salary;
		for (int i = 0; i < list.size(); i++) {
			if(max<list.get(i).salary) {
				max=list.get(i).salary;
			}
		}

		for(int i=0;i<list.size();i++) {
			if(max ==list.get(i).salary)
				System.out.println("hights salary employee is :"+list.get(i));
			
		}

	}
	
	public static void CopyArrayList(ArrayList<Employeee> list) {
		//WAP to copy one ArrayList into another
		
		ArrayList<Employeee> my=list;
		System.out.println(my);
	}
	
	public static void ReverseElements(ArrayList<Employeee> list) {
		// WAP to reverse elements in an ArrayList
		
		Collections.reverse(list);
		System.out.println(list);
	}

	public static void ExtractPortion (ArrayList<Employeee> list) {
		// WAP to extract a portion of an ArrayList
		List<Employeee> list2 =  list.subList(0, 1);
		System.out.println(list2);
		
	}
}

public class Employee_Operation_Task {

	public static void main(String[] args) {

		ArrayList<Employeee> list = new ArrayList<Employeee>();
		Scanner can = new Scanner(System.in);

		System.out.println("enter size of ArrayList");
		int size = can.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();

			System.out.println("enter salary");
			int salary = can.nextInt();

			Employeee em = new Employeee(id, name, salary);
			list.add(em);
		}

		for (Employeee e : list) {

			System.out.println(e);
		}
		System.out.println("/////////////////////////////");
		Employeee.Highest(list);
		
		System.out.println("/////////////////////////////");
		Employeee.CopyArrayList(list);
		
		System.out.println("/////////////////////////////");
		Employeee.ReverseElements(list);


		System.out.println("/////////////////////////////");
		Employeee.ExtractPortion(list);

	}

}
