package com.Collection_Object_Comparable_Comparator;

import java.util.*;

class Emp {
	int id;
	String name;
	int salary;

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}

public class Empoyee_Comparible_Comparator {

	public static void main(String[] args) {
		
		ArrayList<Emp>list=new ArrayList<Emp>();
		
		list.add(new Emp(2,"yash",80000));
		list.add(new Emp(5,"nikhil",78000));
		list.add(new Emp(1,"sonia",78000));
		list.add(new Emp(2,"raj",68000));

		

		for(Emp e:list) {
			System.out.println(e);
		}

		System.out.println("8888888888888888888888888888888888888");
		
		Collections.sort(list, new SalaryCom());
		for(Emp e:list) {
			System.out.println(e);
		}
		
		System.out.println("8888888888888888888888888888888888888");
		
		Collections.sort(list, new NameComparator());
		for(Emp e:list) {
			System.out.println(e);
		}
	}

}

class SalaryCom implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
	
		if(o1.salary==o2.salary)
		{
			return o1.id-o2.id;
		}
		else {
		return o1.salary-o2.salary;
		}
	}
	
}


class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.name.compareTo(o2.name);
	//	return o1.name.compareTo(null)
	}
	
}



