package com.Constructor;

public class EmployeeTask {
	int eid;
	String ename;
	int esalary;
	int pf;
	int pfSalary;

	void acceptDetails(int id, String name, int salary) {
		eid = id;
		ename = name;
		esalary = salary;

	}
	
	void calculatePF(){
		pf=(esalary/100)*12;
		pfSalary = esalary-pf;
		//System.out.println(pf);
	//	System.out.println(pfSalary);
	}

	void display() {
		
		System.out.println(eid + "  " + ename + "  " + esalary+"    "+pf+"    "+pfSalary);
	}

	public static void main(String[] args) {
		System.out.println("id" + "   " + "name" + "  " + "salary"+"    "+"pf(12%)"+" "+"pfSalary");
		
		EmployeeTask em = new EmployeeTask();
		em.acceptDetails(101, "viren", 45000);
		em.calculatePF();
		em.display();
		
		System.out.println("---------------------------------");
		
		EmployeeTask em1= new EmployeeTask();
		em1.acceptDetails(102, "sidd", 50000);
		em1.calculatePF();
		em1.display();
		
		

		

	}

}
