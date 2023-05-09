package com.Collection_WrittenTest;
import java.util.*;

//14.	Write a Program in Java, You have an Employee class
//Class Employee { 
//String name; 
//int eid, 
//int mgrid; 
//} 
//Every manager is also employee. So create an array of 5 Emp and print all Employee along with their Manager name.

class Employee{
	int eid;
	String ename;
	int merid;
	List<String>Emp;
	public Employee(int eid, String ename, int merid,List<String>Emp) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.merid = merid;
		this.Emp=Emp;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", merid=" + merid + "Emp=+" +Emp+"]";
	}
	
}
public class ShowManegar_With_Employee {

	public static void main(String[] args) {
		
		ArrayList<Employee>list=new ArrayList<>();
		list.add(new Employee(101,"vicky",501, Arrays.asList("ramesh","kiran","avi","gaurav","prasad")));
		list.add(new Employee(102,"kundan",901, Arrays.asList("hitesh","mahesh","sagar","viren","shankar")));
		
		for(Employee e:list) {
			System.out.println(e.ename+" "+e.Emp);
		}
	}

}
