package com.Collection_Object;

import java.util.*;

class Employeet {
	int eid;
	String ename;
	int esalary;

	public Employeet(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employeet [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}

class Departmentt {
	int id;
	String name;
	ArrayList<Employeet> al;

	public Departmentt(int id, String name, ArrayList<Employeet> al) {
		super();
		this.id = id;
		this.name = name;
		this.al = al;
	}

	@Override
	public String toString() {
		return "Departmentt [id=" + id + ", name=" + name + ", al=" + al + "]";
	}

}

public class ArryList_In_ArrayList {

	public static void main(String[] args) {

		
		ArrayList<Departmentt> list=new ArrayList<Departmentt>();
		Scanner can=new Scanner(System.in);
		
		for(int i=0;i<1;i++) {
			System.out.println("enter id");
			int id=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			ArrayList<Employeet>al=new ArrayList<Employeet>();
			System.out.println("enter the no of employee");
			int n=can.nextInt();
			
			for(int j=0;j<n;j++) {
				System.out.println("enter the eid");
				int eid=can.nextInt();
				
				System.out.println("enter the ename");
				String ename=can.next();
				
				System.out.println("enter the esalary");
				int esalary=can.nextInt();
				
				al.add(new Employeet (eid,ename,esalary));
				
			}
			
			list.add(new Departmentt(id,name,al));
		}
		
		for(Departmentt d:list) {
			System.out.println(d.id+" "+d.name+" "+d.al);
			System.out.println();
		}
		
		System.out.println("888888888888888888888888888888888888888");
		
		for(Departmentt d:list) {
			System.out.println(d.id+" "+d.name+" ");
			for(Employeet e:d.al)
			{
				System.out.println(e);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
