package com.Collection_WrittenTest;

import java.util.*;
//
//10. An arraylist is list of Emp objects.Also there is arraylist of Dept and ArrayList of Address,Each
//Emp class has eid,ename,deptid.
//Dept class has deptid,dname,city.
//Addres class has pin,city.Write a program to accept zip from user and print all emp name of Emp who in that accepted pin.and also
//create ArrayList<empInfo>which contains emp name,dept name who are from given pin.

class Emp {
	int eid;
	String ename;
	int depid;

	public Emp(int eid, String ename, int depid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.depid = depid;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", depid=" + depid + "]";
	}

}

class Dept {
	int depid;
	String dname;
	String city;

	public Dept(int depid, String dname, String city) {
		super();
		this.depid = depid;
		this.dname = dname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Dept [Depid=" + depid + ", dname=" + dname + ", city=" + city + "]";
	}

}

class Addres {
	int pin;
	String city;

	public Addres(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Addres [pin=" + pin + ", city=" + city + "]";
	}

}

public class Pin {

	public static void main(String[] args) {

		ArrayList<Emp> listE = new ArrayList<>();
		ArrayList<Dept> listD = new ArrayList<>();
		ArrayList<Addres> listA = new ArrayList<>();

		ArrayList<Empinfo> listF = new ArrayList<>();

		listE.add(new Emp(1, "John", 1));
		listE.add(new Emp(2, "Alice", 2));
		listE.add(new Emp(3, "vicky", 1));

		listD.add(new Dept(1, "Sales", "New York"));
		listD.add(new Dept(2, "Marketing", "Los Angeles"));

		listA.add(new Addres(12345, "New York"));
		listA.add(new Addres(67890, "Los Angeles"));

		Scanner can = new Scanner(System.in);
		System.out.println("Enter PIN");

		int pin = can.nextInt();
		int num = 0;
		String sname = "";

		for (int i = 0; i < listA.size(); i++) {
			boolean find = false;
			if (pin == listA.get(i).pin) {
				// System.out.println(listA.get(i).city);
				find = true;
			}

			if (find == true) {

				for (int j = 0; j < listD.size(); j++) {
					if (listA.get(i).city.equals(listD.get(j).city)) {

						// System.out.println(listD.get(j).depid);
						num = listD.get(j).depid;
						sname = listD.get(i).dname;
					}
				}

			}

		}

		for (int k = 0; k < listE.size(); k++) {
			if (listE.get(k).depid == num) {
			//	System.out.println(pin + "--> " + listE.get(k).ename);
			//	System.out.println(sname);
				listF.add(new Empinfo(listE.get(k).ename,sname ));

			}
			
		}
		for(Empinfo e:listF) {
			System.out.println(e);
		}
	}

}

//create ArrayList<empInfo>which contains emp name,dept name who are from given pin.
class Empinfo {
	String name;
	String dept;

	public Empinfo(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Empinfo [name=" + name + ", dept=" + dept + "]";
	}

}
