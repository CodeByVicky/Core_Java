package com.Collection_Object;

import java.util.*;

class Employee {
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

}

public class EmployeeMoreThan {

	public static void main(String[] args) {
		
		
		ArrayList <Employee> list=new ArrayList<Employee>();
		Scanner can=new Scanner(System.in);
		
		System.out.println("enter size of ArryList");
		int size=can.nextInt();
		
			
		for(int i=0;i<size;i++) {
			
			System.out.println("enter id");
			int id=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			System.out.println("enter salary");
			int salary=can.nextInt();
			
			
			Employee e=new Employee(id,name,salary);
			list.add(e);
		}
		
		System.out.println("///////////////////////////////////////////////");
		
		for(Employee e:list) {
			if(e.salary>60000)
			System.out.println(e);
		}
		
		System.out.println("////////////////////////////////////////////////////");
		
		Iterator <Employee> itr= list.iterator();
		
		while(itr.hasNext()) {
			Employee emp=itr.next();
			if(emp.salary>60000)
			
			System.out.println(emp);
		}
		

	}

}
