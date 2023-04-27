package com.Collection;
import java.util.*;

public class ArrayList_Input {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();   // non genaric
		
		list.add(56);
		list.add("kalamb");
		list.add('c');
		list.add(56.89);
		
		System.out.println(list);
		
		
		ArrayList <Integer>a = new ArrayList<Integer>();    //genaric
		
		a.add(null);
		a.add(45);
		a.add(556);
		
		System.out.println(a);
		

	}

}
