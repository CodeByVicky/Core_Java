package com.Collection_Object_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Stu{
	int roll;
	String name;
	int age;
	public Stu(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stu [Roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void Add(ArrayList<Stu> list){
		Scanner can=new Scanner(System.in);
		System.out.println("add No.list");
		int num=can.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("enter roll no");
			int model=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			System.out.println("enter age");
			int age=can.nextInt();
			
			Stu c=new Stu(age, name, age);
			
			
			list.add(c);
			
			
			}
		for(Stu s:list) {
			System.out.println(s);
		}
		
	}
	
	
}

public class Assingments_Student_Operatoin {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList<Stu>();

		list.add(new Stu(101, "vikcky", 20));
		list.add(new Stu(102, "saheb", 21));
		list.add(new Stu(105, "vinod", 25));
		list.add(new Stu(109, "karn", 21));

		
		for(Stu s:list) {
			System.out.println(s);
		}
		Collections.sort(list, new rollNo());
		
		System.out.println("88888888888888888888888888");
		System.out.println("sort by rollNo");
		for(Stu s:list) {
			System.out.println(s);
		}
		
		Collections.sort(list,new findName());
		System.out.println("88888888888888888888888888");
		System.out.println("sort by name");
		for(Stu s:list) {
			System.out.println(s);
		}
		
		
		Collections.sort(list,new FindAge());
		System.out.println("88888888888888888888888888");
		System.out.println("sort by age");
		for(Stu s:list) {
			System.out.println(s);
		}
		
		System.out.println("8888888888888888888888888888888888");
		Stu.Add(list);
	}
	
	
}

class rollNo implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		
		return o1.roll-o2.roll;
	}
	
}

class findName implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}


class FindAge implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		if(o1.age==o2.age) {
			return o1.name.compareTo(o2.name);
			//return o2.name.compareTo(o1.name);
			
		}
		else {
			return o1.age-o2.age;
		}
		
	}
	
}










