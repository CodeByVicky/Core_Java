package com.HashMap_Object;
import java.util.*;

class Stut{
	int id;
	String name;
	int per;
	public Stut(int id, String name, int per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Stut [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	public static void showPer(HashMap<String ,String>map) {
		System.out.println("enter Search per name");
		Scanner can=new Scanner(System.in);
		String fname=can.next();
		
		
		Set myMap=map.entrySet();
		Iterator<Map.Entry<String, String>>it=myMap.iterator();
			while(it.hasNext()) {
			Map.Entry<String, String>m=it.next();
			if(m.getKey().equals(fname))
			System.out.println(m.getKey()+"-->"+m.getValue());
			}
		
	}
	
	public static void show(HashMap<String ,String>map) {
		Set myMap=map.entrySet();
		Iterator<Map.Entry<String, String>>it=myMap.iterator();
			while(it.hasNext()) {
			Map.Entry<String, String>m=it.next();
			System.out.println(m.getKey()+"-->"+m.getValue());
			}
	}
	
}

public class Student_Grade {

	public static void main(String[] args) {
	
		ArrayList<Stut>st=new ArrayList<>();
		st.add(new Stut(101,"tony",99));
		st.add(new Stut(102,"thor",75));
		st.add(new Stut(104,"peter",85));
		st.add(new Stut(106,"yandu",30));
		
		HashMap<String ,String>map=new HashMap();
		
		Iterator<Stut>itr=st.iterator();
		String grade="";
			
		while(itr.hasNext()) {
			
		Stut find=itr.next();
		//System.out.println(find);
		 
		if(find.per>90) {
			grade="A+";
		}else if(find.per<90 && find.per>=85) {
			grade="A";
		}else if(find.per<85 && find.per>35) {
			grade="B";
		}else {
			grade="Fail";
		}
		map.put(find.name, grade);
			
		}

		//System.out.println(map);
		
		
		
			Stut.show(map);
			System.out.println("8888888888888888888888888");
			Stut.showPer(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
