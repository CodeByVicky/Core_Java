package com.Collection_Object;
import java.util.*;
import java.util.Collection;

class Studentt implements Comparable<Studentt>{
	int id;
	String name;
	int marks;
	public Studentt(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Studentt o) {
		
		return this.marks-o.marks;
	}
	
}

public class SortingObject {

	public static void main(String[] args) {
		ArrayList<Studentt>list=new ArrayList<Studentt>();
		
		list.add(new Studentt(1,"rahul",89));
		list.add(new Studentt(2,"viren",90));
		list.add(new Studentt(3,"rohit",80));

		
		
		for(Studentt s:list) {
			System.out.println(s);
		}
		
		System.out.println("88888888888888888888888888888888");
		
		Collections.sort(list);
		for(Studentt s:list) {
			System.out.println(s);
		}
	}

}
