package com.Collection_WrittenTest;
import java.util.*;
//1.	Write a Java program to create a new array list, add some colours (string) and print out the collection.
//2.	Write a Java program to iterate through all elements in an array list (Show all the ways).
//3.	Write a Java program to insert an element into the array list at the first position.
//4.	Write a Java program to retrieve an element (at a specified index) from a given array list. 
//5.	Write a Java program to update specific array element by given element.

public class Color {

	public static void main(String[] args) {
		ArrayList <String>list=new ArrayList<>();
		
		list.add("red");
		list.add("blue");
		list.add("black");
		list.add("orenge");
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("88888888888888888888888");
		list.add(0, "white");
		System.out.println(list);
		
		
		System.out.println("888888888888888888");
		list.add(3,"yellow");
		System.out.println(list);
		
		
		System.out.println("888888888888888888");
		list.set(1, "brown");
		System.out.println(list);
	}

}
