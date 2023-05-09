package com.Collection_Object_Comparable_Comparator;

import java.util.*;

class Order {
	int o_Id;
	String o_Date;
	String Cour_name;

	public Order(int o_Id, String o_Date, String cour_name) {
		super();
		this.o_Id = o_Id;
		this.o_Date = o_Date;
		Cour_name = cour_name;
	}

	@Override
	public String toString() {
		return "Order [o_Id=" + o_Id + ", o_Date=" + o_Date + ", Cour_name=" + Cour_name + "]";
	}

}

class Customer implements Comparable<Customer>{
	int c_Id;
	String c_Name;
	String City;
	Order o;

	public Customer(int c_Id, String c_Name, String city, Order o) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		City = city;
		this.o = o;
	}

	@Override
	public String toString() {
		return "Customer [c_Id=" + c_Id + ", c_Name=" + c_Name + ", City=" + City + ", o=" + o + "]";
	}
	
	public int compareTo(Customer c) {
		return this.o.o_Date.compareTo(c.o.o_Date);
	}

}

public class Containment_Accending_Deccingding_using_String {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<>();

		list.add(new Customer(101, "rocky", "pune", new Order(501, "2005/05/21", "fed-parsal")));
		list.add(new Customer(102, "vivek", "kalamb", new Order(502, "2005/07/21", "fed-post")));
		list.add(new Customer(103, "rohan", "mumbai", new Order(503, "2008/01/21", "fed-parsel")));
		list.add(new Customer(104, "mahesh", "latur", new Order(504, "2001/09/21", "fed-post")));
		
		
		
		
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("88888888888888888888888888888888888888888");
		
		Collections.sort(list);
		
		for(Customer c:list) {
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
