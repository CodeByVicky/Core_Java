package com.Collection_Object_Comparable_Comparator;

import java.util.*;

class Cource {
	int cid;
	String cname;
	int fee;

	public Cource(int cid, String cname, int fee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Cource [cid=" + cid + ", cname=" + cname + ", fee=" + fee + "]";
	}

}

class Student2 implements Comparable<Student2>{
	int id;
	String name;
	ArrayList<Cource> co;

	public Student2(int id, String name, ArrayList<Cource> co) {
		super();
		this.id = id;
		this.name = name;
		this.co = co;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", co=" + co + "]";
	}

	@Override
	public int compareTo(Student2 o) {
		
		return this.id-o.id;
	}

}

public class Sorting_Student_course {

	public static void main(String[] args) {

		ArrayList<Cource> co = new ArrayList<Cource>();
		co.add(new Cource(106, "java", 50000));
		co.add(new Cource(101, "c++", 50000));

		ArrayList<Student2> list = new ArrayList<Student2>();

		list.add(new Student2(101, "vikcky", co));
		list.add(new Student2(102, "saheb", co));

		
		for(Student2 s:list) {
			System.out.println(s);
		}
		
		
	}

}
