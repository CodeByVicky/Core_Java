package com.Static;

class Empolyee{
	int id;
	String name;
	static String clg="MMcoe";
	
	Empolyee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void show() {
		System.out.println(id+" "+name+" "+clg);
	}
	
	public static void display() {
		//System.out.println(id+" "+name+" "+clg);
		System.out.println(clg);
	}
}

public class Example_Static_Member_Fuctions {
	
	

	public static void main(String[] args) {
		
		Empolyee em=new Empolyee(101,"vicky");
		em.show();
		em.display();

	}

}
