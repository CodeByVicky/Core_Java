package com.Collection_Object;

import java.util.*;

class ClassRoom {

	private float mark1;
	private float mark2;
	private float mark3;

	int per;

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

	public float getMark1() {
		return mark1;
	}

	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}

	public float getMark2() {
		return mark2;
	}

	public void setMark3(float mark3) {
		this.mark3 = mark3;
	}

	public float getMark3() {
		return mark3;
	}

	public int Per() {
		int total = (int) (mark1 + mark2 + mark3);
		per = (total * 100) / 300;

		return per;
	}

}

class Student {
	private int id;
	private String name;
	private ClassRoom cl;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCl(ClassRoom cl) {
		this.cl = cl;
	}

	public ClassRoom getCl() {
		return cl;
	}
}

public class StudentContainmentUsingGetterSetter {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList();
		Scanner can = new Scanner(System.in);

		System.out.println("enter size of ArrayList");
		int size = can.nextInt();

		for (int i = 0; i < size; i++) {

			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();

			System.out.println("enter mark1");
			int mark1 = can.nextInt();

			System.out.println("enter mark2");
			int mark2 = can.nextInt();

			System.out.println("enter mark3");
			int mark3 = can.nextInt();

			ClassRoom cl = new ClassRoom();
			cl.setMark1(mark1);
			cl.setMark2(mark2);
			cl.setMark3(mark3);

			Student stu = new Student();
			stu.setId(id);
			stu.setName(name);
			stu.setCl(cl);

			list.add(stu);

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getCl().getMark1()
					+ " " + list.get(i).getCl().getMark2() + " " + list.get(i).getCl().getMark3());
		}

		for (Student s : list) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getCl().getMark1() + " " + s.getCl().getMark2()
					+ " " + s.getCl().getMark3() + " " + s.getCl().Per());
		}

	}

}
