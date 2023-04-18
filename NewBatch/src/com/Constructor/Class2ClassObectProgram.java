package com.Constructor;

public class Class2ClassObectProgram {
	
	int id;
	String name;
	double marks;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2ClassObectProgram stud = new Class2ClassObectProgram();
		System.out.println(stud.id +" "+stud.name +" "+ stud.marks);
		
		stud.id=10;
		stud.name="nikhil";
		stud.marks=78;
		
		
		System.out.println(stud.id +" "+stud.name +" "+ stud.marks);
		
		System.out.println("---------------------------------------");
		
		Class2ClassObectProgram stud1 = new Class2ClassObectProgram();
		System.out.println(stud1.id +" "+stud1.name +" "+ stud1.marks);
		
		stud1.id=14;
		stud1.name="yash";
		stud1.marks=80;
		
		
		System.out.println(stud1.id +" "+stud1.name +" "+ stud1.marks);
		

	}

}
