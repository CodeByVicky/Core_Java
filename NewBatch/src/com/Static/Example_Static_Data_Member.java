package com.Static;


class Student{
	int id;
	String name;
	static String clg="MMcoe";
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void show() {
		System.out.println(id+" "+name+" "+clg);
	}
}

public class Example_Static_Data_Member {

	public static void main(String[] args) {
		
		Student stu=new Student (101,"vicky");
		stu.show();
		
		Student stu1=new Student (102,"viki");
		stu1.show();

	}

}
