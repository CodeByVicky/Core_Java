package com.Xobin;

import java.util.*;

public class Adjucent_Elements {

	public static void main(String[] args) {

		Scanner can = new Scanner(System.in);
		System.out.println("enter string");
		String str=can.nextLine();
		
		System.out.println(str);
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i=i+2) {
			int sum=Integer.parseInt(arr[i]+Integer.parseInt(arr[i+1]));
			System.out.println(sum);
		}
	}

}
