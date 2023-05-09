package com.HashMap_Object;
import java.util.*;

class Stu{
	int id;
	String name;
	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object o) {
		Stu s=(Stu)o;
		if(this.id==s.id && this.name.equals(s.name)) {
			return true;
		}
		return false;
	}
}
public class StudentAdmision {

	public static void main(String[] args) {
	
		HashMap<Stu,Integer>list=new HashMap();
		
		HashMap<Stu,ArrayList<Integer>>list1=new HashMap();
		ArrayList<Integer>mark=new ArrayList<>();
		mark.add(70);
		mark.add(90);
		mark.add(70);
		
		list1.put(new Stu(51,"rohul"), mark);
		
		list.put(new Stu(101,"bindu"), 80);
		list.put(new Stu(101,"rakesh"), 78);
		list.put(new Stu(103,"gautam"), 90);
		list.put(new Stu(103,"gautam"), 80);
		
		for(Map.Entry<Stu, Integer>m:list.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
