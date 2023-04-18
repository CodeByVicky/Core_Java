package com.Encapsulation;
class Employee{
	int eid;
	String ename;
	public Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	/*public String toString(){
		return eid+" "+ename;
	}*/
	public void showEmp(){
		System.out.println(eid+" "+ename);
	}
}

public class EncapsulationDepartment {
	int did;
	String dname;
	Employee emp;
	
	
	public EncapsulationDepartment(int did, String dname,Employee emp){
		this.did=did;
		this.dname=dname;
		this.emp=emp;
	}
	
	/*public String toString(){
		return did+" "+dname+" "+emp;
	}*/
	public void showDept(){
		System.out.println(did+" "+dname);
		emp.showEmp();
	}

	public static void main(String[] args) {
		
		
		/*Employee em= new Employee(123,"jbs");
		EncapsulationDepartment enp= new EncapsulationDepartment(101,"vicky",em);
		System.out.println(enp);
		*/
		
	EncapsulationDepartment enp= new EncapsulationDepartment(101,"vicky",new Employee(10,"amol"));
		System.out.println(enp);
		enp.showDept();

	}

}
