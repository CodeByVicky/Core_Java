package com.Constructor;

import java.util.Scanner;

public class Student {

	int sid;
	String sname;
	int sper;
	int total;
	int a,b,c;

	void acceptDetails(int id, String name) {
		sid = id;
		sname = name;
	}

        void percentage() {
		 total = a + b + c;
		sper = ((total * 100) / 300);

	}
        void scanner(){
        	Scanner can = new Scanner(System.in);
    		System.out.println("Enter Marks of three student");
    		
    		 a = can.nextInt();
    		 b = can.nextInt();
    		 c = can.nextInt();
        }

	public void display() {
		System.out.println(sid + " " + sname + "     " + sper + "%");
	}

	public static void main(String[] args) {
		
		
     	Student st = new Student();
     	st.scanner();
     	st.percentage();
		st.acceptDetails(101, "viren");
		
		System.out.println("------------------------------------");
		
		Student st1 = new Student();
		st1.scanner();
	//	Scanner can1 = new Scanner(System.in);
	/*	System.out.println("Enter Marks of 2nd student");
		
		 a = can.nextInt();
		 b = can.nextInt();
		 c = can.nextInt();*/
		 
     	st1.percentage();
        st1.acceptDetails(102, "siddh");
        
    	System.out.println("------------------------------------");
		
		Student st2 = new Student();
		st2.scanner();
/*		Scanner can2 = new Scanner(System.in);
		System.out.println("Enter Marks of 3rd student");
		
		 a = can.nextInt();
		 b = can.nextInt();
		 c = can.nextInt();
		 */
		st2.percentage();
		st2.acceptDetails(103, "rohit");
		
		System.out.println("------------------------------------");
		
		System.out.println("id  name     percentage");
		st.display();
		st1.display();
		st2.display();

	}

}
