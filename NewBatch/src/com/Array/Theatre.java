package com.Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Theatre {
	String name;
	String location;
	int screen[];
	
	 Theatre(String name,String location){
		this.name=name;
	this.location=location;
	
		
	
	}
	 
	 public Theatre(String sc) {
		 this.screen=sc;
	}

	public  String toString(){
		 return name+location+screen;
	 }
	public static void main(String[] args) {
		
		
		int arr[]=new int [1];
		
		Scanner can=new Scanner(System.in);
		Theatre[] the=new Theatre[1];
		
		for(int i=0;i<arr.length;i++){
			
		System.out.println("enter name");
		String name=can.next();
		
		System.out.println("enter Lacation");
		String location= can.next();
		
		System.out.println("enter screen");
		int sc=can.nextInt();
		int[] scr=new int[sc];
		for(int i1=0;i1<scr.length;i1++){
			System.out.println(scr[i]);
			the[i1]=new Theatre(scr[i]);
		}
		
		   the[i]=new Theatre(name,location);
		
		}
    for(Theatre tre:the){
    	System.out.println(tre);
    }
		
		

	}

}
