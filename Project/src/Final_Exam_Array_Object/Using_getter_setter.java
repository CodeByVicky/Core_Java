package Final_Exam_Array_Object;

import java.util.*;

public class Using_getter_setter {
	private int id;
	private String name;

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

	
	@Override
	public String toString() {
		return "Using_getter_setter [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Using_getter_setter[] arr = new Using_getter_setter[2];
		Scanner can = new Scanner(System.in);

	
		for (int i = 0; i < arr.length; i++) {
			Using_getter_setter us = new Using_getter_setter();
			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();

			us.setId(id);
			us.setName(name);

			arr[i] = us;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}

//		for(Using_getter_setter s:arr) {
//			System.out.println(s);
//		}
	}

}
