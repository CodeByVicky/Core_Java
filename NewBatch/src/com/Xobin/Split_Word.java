package com.Xobin;

import java.util.*;

public class Split_Word {

	public static void main(String[] args) {

	//	String s = "    core    java      sessions";
		Scanner can=new Scanner(System.in);
		System.out.println("enter line");

		String s=can.nextLine();
		
		
		String find = s.replaceAll("\\s+", " ").trim();
		System.out.print(find);

	}
}