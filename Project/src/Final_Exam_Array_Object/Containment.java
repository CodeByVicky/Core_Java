package Final_Exam_Array_Object;

import java.util.*;

class mark {
	int mar;
	int hin;
	int eng;

	public mark(int mar, int hin, int eng) {
		super();
		this.mar = mar;
		this.hin = hin;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "mark [mar=" + mar + ", hin=" + hin + ", eng=" + eng + "]";
	}

}

public class Containment {

	int id;
	String name;
	mark m;

	public Containment(int id, String name, mark m) {
		super();
		this.id = id;
		this.name = name;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Containment [id=" + id + ", name=" + name + ", m=" + m + "]";
	}

	public static void main(String[] args) {
		Containment co[] = new Containment[2];
//		mark m=new mark(45, 46, 23);
//		mark m1=new mark(56,89,90);
//		
//		
//		co[0]=new Containment(1,"vikcy",m);
//		co[1]=new Containment(2,"mother",m1);

		Scanner can = new Scanner(System.in);

		for (int i = 0; i < co.length; i++) {

			System.out.println("enter id");
			int id = can.nextInt();

			System.out.println("enter name");
			String name = can.next();
			
			System.out.println("enter mark");
			int mar1 = can.nextInt();

			System.out.println("enter mark");
			int mar2 = can.nextInt();

			System.out.println("enter mark");
			int mar3 = can.nextInt();

			mark m = new mark(mar1, mar2, mar3);

			co[i] = new Containment(id, name, m);

		}

		for (Containment c : co) {
			System.out.println(c);
		}

	}

}
