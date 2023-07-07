package MarchWritten;

import java.util.*;

//18.Write a java program to create array of 3 employees. 
//Take input or hardcode for all 3 employees from console. 
//Employee class is as follows Employee { int id , String name, Dept d }
//Dept { int deptid , String dname}
//Make use of constructor of Emp and Dept to create employee objects

class Dept {
	int deptid;
	String dname;

	public Dept(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", dname=" + dname + "]";
	}

}

class Employee1 {
	int id;
	String name;
	Dept d;

	public Employee1(int id, String name, Dept d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", d=" + d + "]";
	}

}

public class Employee_Array_18 {

	public static void main(String[] args) {

		
		Scanner can=new Scanner(System.in);
		
		Employee1[] arr=new Employee1[3];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Employee id");
			int id=can.nextInt();
			
			System.out.println("Employee name");
			String name =can.next();
			
			System.out.println("Department id");
			int Did=can.nextInt();
			
			System.out.println("Department name");
			String Dname =can.next();
			
			
		
			
			Dept d=new Dept(Did,Dname);
			 arr[i]=new Employee1(id,name,d);
			
			
		}
		
		
		for(Employee1 emp:arr) {
			System.out.println(emp.id+" "+emp.name+" "+emp.d.deptid+" "+emp.d.dname);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
