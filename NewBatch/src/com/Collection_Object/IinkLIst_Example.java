package com.Collection_Object;
import java.util.*;

class Stu{
	int id;
	String name;
	List<String>hobbies;
	public Stu(int id, String name, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}
	
}

public class IinkLIst_Example {

	public static void main(String[] args) {
		LinkedList<Stu>list=new LinkedList<>();
		
		
		list.add(new Stu(101,"vikcy",Arrays.asList("dancing","playing cricket")));
		list.add(new Stu(102,"kiran",Arrays.asList("Reading","waching tv","runing")));
		

		for(Stu s:list) {
			System.out.println(s);
		}
	}

}
