package com.Array;

import java.util.Scanner;

public class Rainfall {
	int sum=0;
	static int size;

	void average(int a[]){
		for(int i=0;i<a.length;i++){
		//	System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("sum is :"+sum);
		int  ave=sum/size;
		System.out.println("average is :"+ave);
		
	}
	
	void index(int a[]){
		Scanner can=new Scanner(System.in);
		System.out.println("enter find number");
		int count=0;
		int count1=0;
		int num=can.nextInt();
		for(int i=0;i<a.length;i++){
			count1++;
			if(a[i]==num){
				count++;
			System.out.println("present in array :"+"index number "+count1);
			break;
			}
				
		}
		
		if(count!=1)
		System.out.println("not present in array");
		
	}

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
		System.out.println("enter size");
		size=can.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter element array");
		for(int i=0;i<a.length;i++){
			 a[i]=can.nextInt();
		}
		
		Rainfall rain=new Rainfall();
		rain.average(a);
		rain.index(a);
			

	}

}
