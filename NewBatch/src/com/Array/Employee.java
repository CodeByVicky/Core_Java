package com.Array;

import java.util.Scanner;

class Employee1{
	int id;
	String name;
	 int salary;
	 int a;
	
	Employee1(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	public String toString(){
		
		return id+" "+name+" "+salary;
		
	}

}
public class Employee {


	public static void main(String[] args) {
		
		Employee1 stud[]=new Employee1 [2];
		
		Scanner can=new Scanner(System.in);
		for(int i=0;i<stud.length;i++){
			System.out.println("enter id");
			int id=can.nextInt();
			
			System.out.println("enter name");
			String  name=can.next();
			
			System.out.println("enter salary");
			int salary=can.nextInt();
			
			stud[i]=new Employee1(id,name,salary);
		}
	for(Employee1 s:stud){
		
		
		if(s.salary>=50000){
			System.out.println(s);
			}
		}

	}

}
