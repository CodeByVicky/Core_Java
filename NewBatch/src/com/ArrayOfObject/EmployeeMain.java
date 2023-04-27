package com.ArrayOfObject;
import java.util.*;



 class EmployeeOdd { //POJO class= plain old java object
	
	private int id;
	private String name,dept;
	private double salary;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
	
	

}

public class EmployeeMain {


	EmployeeOdd emp[]= new EmployeeOdd[2];
	Scanner sc= new Scanner(System.in);
	

	/*void addEmployee()
	{
		
		Employee e1= new Employee();
		e1.setId(101);
		e1.setName("Riya");
		e1.setDept("HR");
		e1.setSalary(70000);
		
		Employee e2= new Employee();
		e2.setId(12);
		e2.setName("Anjali");
		e2.setDept("Finance");
		e2.setSalary(65000);
		
		emp[0]=e1;
		emp[1]=e2;
		

	}*/
	
	void addEmpData()
	{
		
		for( int i=0;i<emp.length;i++)  //                              i=0         i=1          i=2
		{
			System.out.println("Enter id,name,Dept,salary: ");
			int id= sc.nextInt();  //new line
			sc.nextLine();
			String name=sc.nextLine();
			String dept=sc.next();
			double salary=sc.nextDouble();
			
			EmployeeOdd e= new EmployeeOdd();   //                                          emp e
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			
			emp[i]=e;//                                       emp[0]=e  em[1]=e    emp[2]=e

		}
	}
	
	void displayArray()
	{
		for(EmployeeOdd obj:emp)
		{
			if(obj!=null)
				System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getDept()+" "+obj.getSalary());
		}
	}
	
	void searchEmployeeData()
	{
		System.out.println("ENter Employee id: ");
		int id= sc.nextInt();
		
		for(EmployeeOdd obj:emp)
		{
			if(obj!=null)
			{
				if(obj.getId()==id )
					System.out.println(obj);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e[]= new Employee[3];
		
		//System.out.println(Arrays.toString(e));
		
		EmployeeMain obj= new EmployeeMain();
		
		//obj.addEmployee();
		obj.addEmpData();
		obj.displayArray();
		
		obj.searchEmployeeData();
		

	}

}
