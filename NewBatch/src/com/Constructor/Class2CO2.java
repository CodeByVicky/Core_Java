package com.Constructor;

public class Class2CO2 {
	int eid;
	String ename;
	int salary;
	
	public void acceptDetails(int id,String name,int sal){
		eid=id;
		ename=name;
		salary =sal;
	}
	
	public void display(){
		System.out.println(eid+" "+ename+" "+salary);
	}

	public static void main(String[] args) {
		
		Class2CO2 co= new Class2CO2();
		co.acceptDetails(10, "yash", 45000);
		co.display();
		
		System.out.println("--------------------------");
		
		Class2CO2 co1= new Class2CO2();
		co1.acceptDetails(11, "rupesh", 50000);
		co1.display();

	}

}
