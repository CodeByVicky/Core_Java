package com.Case_Study;

import java.util.*;
import java.util.Map.Entry;

class Student {
	private int id;
	private String name;
	private String course;
	private int per;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public void Add(ArrayList<Student> list) {
		Scanner can = new Scanner(System.in);

		System.out.println("which number of student add");
		int size = can.nextInt();

		for (int i = 0; i < size; i++) {
			Student stu = new Student();

			System.out.println("Enter Student Id");
			stu.setId(can.nextInt());

			System.out.println("Enter Student Name");
			stu.setName(can.next());

			System.out.println("Enter Student Course");
			stu.setCourse(can.next());

			System.out.println("Enter Student Persentage");
			stu.setPer(can.nextInt());

			list.add(stu);
		}
		System.out.println("Information Add Sucessful......");

	}

	public void Display(ArrayList<Student> list) {
		for (Student stu : list) {
			System.out.println("Id:" + stu.getId() + " " + "Name:" + stu.getName() + " " + "Course:" + stu.getCourse()
					+ " " + "Percentage:" + stu.getPer());
		}
	}

	public void Remove(ArrayList<Student> list) {
		Iterator<Student> itr = list.iterator();

		Scanner can = new Scanner(System.in);
		System.out.println("Enter Remove Student Id");
		int find = can.nextInt();

		while (itr.hasNext()) {
			Student s = itr.next();

			if (s.getId() == find) {
				itr.remove();
			}

		}
		System.out.println("Delete Sucessful.............");

	}

	public void Search(ArrayList<Student> list) {

		Iterator<Student> itr = list.iterator();

		Scanner can = new Scanner(System.in);
		System.out.println("Enter Search Student Id");
		int find = can.nextInt();

		while (itr.hasNext()) {
			Student s = itr.next();

			if (s.getId() == find) {
				System.out.println("Id:" + s.getId() + " " + "Name:" + s.getName() + " " + "Course:" + s.getCourse()
						+ " " + "Percentage:" + s.getPer());
			}

		}
	}

	public void DisplayCourse(ArrayList<Student> list) {
		HashMap<String, ArrayList<String>> map = new HashMap();

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			Student stu = itr.next();
			String s = stu.getCourse();

			if (map.containsKey(s)) {
				ArrayList<String> al = map.get(s);
				al.add(stu.getName());
				map.put(s, al);
			} else {
				ArrayList<String> al = new ArrayList<String>();
				al.add(stu.getName());
				map.put(s, al);
			}
		}

		Iterator<Map.Entry<String, ArrayList<String>>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, ArrayList<String>> e = it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}

public class Student_Case_Studies {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		Student stu = new Student();

		stu.Add(list);
		stu.Display(list);
		 stu.Remove(list);
	    stu.Search(list);
		stu.DisplayCourse(list);

	}
}
