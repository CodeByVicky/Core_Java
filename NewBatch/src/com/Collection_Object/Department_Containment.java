package com.Collection_Object;

import java.util.*;

class Employee1 {
	int e_id;
	String e_name;
	float salary;

	public Employee1(int e_id, String e_name, float salary) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.salary = salary;
	}

	public String toString() {
		return e_id + " " + e_name + " " + salary;
	}

}

class Department {
	int d_id;
	String d_name;
	Employee1 e;

	public Department(int d_id, String d_name, Employee1 e) {
		this.d_id = d_id;
		this.d_name = d_name;
		this.e = e;
	}

	public String toString() {
		return d_id + " " + d_name + " " + e;
	}

	public static void count(ArrayList<Department> list) {

		Scanner can = new Scanner(System.in);
		System.out.println("find department");
		String dep = can.next();
		int find = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).d_name.equals(dep)) {
				find++;
			}
		}
		if (find != 0)
			System.out.println(dep + " " + "present is:" + find);
		else
			System.out.println("this department is not present........ ");
	}

}

public class Department_Containment {

	public static void main(String[] args) {

		ArrayList<Department> list = new ArrayList();

		list.add(new Department(1, "Hr", new Employee1(101, "viren", 50000)));
		list.add(new Department(2, "Mar", new Employee1(102, "bittu", 60000)));
		list.add(new Department(3, "Hr", new Employee1(103, "kittu", 55000)));

		System.out.println(list);

		System.out.println("888888888888888888888888888888888888888");

		Department.count(list);

	}

}
