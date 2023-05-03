package com.Collection.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector();
		
		v.add("red");
		v.addElement("green");
		
		System.out.println(v);
		
		
		System.out.println("///////////////////////");
		
		Enumeration <String> e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
