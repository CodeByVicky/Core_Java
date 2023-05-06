package com.Collection_Object_Comparable_Comparator;
import java.util.*;

class Car implements Comparable<Car>{
	int model;
	String name;
	int price;
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int compareTo(Car c) {
		//return this.price-c.price;//ascending
		//return this.name.compareTo(c.name);//ascending
		return c.name.compareTo(this.name);//decending
		
	}
	
}

public class Student_Comparible_Comparator {

	public static void main(String[] args) {
		

		LinkedList<Car>list=new LinkedList<Car>();
		
		
		Scanner can=new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.println("enter model no");
			int model=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			System.out.println("enter price");
			int price=can.nextInt();
			
			Car c=new Car();
			c.setModel(model);
			c.setName(name);
			c.setPrice(price);
			
			list.add(c);
			
			
		}
		
		for(Car c:list) {
			System.out.println(c.getModel()+" "+c.getName()+" "+c.getPrice());
			
		}
		
		System.out.println("777777777777777777777777777777777777777777777777777777777");
		
//		Collections.sort(list);
//
//		for(Car c:list) {
//			System.out.println(c.getModel()+" "+c.getName()+" "+c.getPrice());
//			
//		}
		
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).price>list.get(j).price) {
					Car temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
							
				}
			}
		}
		
		System.out.println("777777777777777777777777777777777777777777777777777777777");
		
		for(Car c:list) {
			System.out.println(c.getModel()+" "+c.getName()+" "+c.getPrice());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
