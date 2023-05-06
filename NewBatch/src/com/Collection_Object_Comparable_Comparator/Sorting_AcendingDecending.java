package com.Collection_Object_Comparable_Comparator;
import java.util.*;


class Itemm implements Comparable <Itemm>{
	int id;
	String name;
	float price;
	public Itemm(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Itemm t) {
		
		return  (int) (t.price-this.price);
	}
	
	
}

public class Sorting_AcendingDecending {

	public static void main(String[] args) {
		ArrayList<Itemm> list=new ArrayList<Itemm>();
		
		list.add(new Itemm(1,"soap",50));
		list.add(new Itemm(2,"milk",40));
		list.add(new Itemm(3,"oil",100));
		
		Collections.sort(list);
		
		//System.out.println(list);
		
		for(Itemm i:list) {
			System.out.println(i);
		}
		
		System.out.println("8888888888888888888888888");
		
		Collections.sort(list,new Item2());
//		
//		for(Itemm i:list) {
//			System.out.println(i);
//		}

	}

	

}

class Item2 implements Comparator<Item2> {

	

	@Override
	public int compare(Item2 o1, Item2 o2) {
	//	return o1.compare(o1, o2)
		
	}
	

	
	
}
