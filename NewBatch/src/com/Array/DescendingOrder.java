package com.Array;

import java.util.Scanner;



public class DescendingOrder {
	
	void show(int arr[]){
		
	
		for(int i=0;i<arr.length;i++){
		//	System.out.println(arr[i]);
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			}
		
	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	    }
	}
	
	

	
	public static void main(String[] args) {
		
	Scanner can=new Scanner(System.in);
	
	System.out.println("size");
	int size=can.nextInt();
    int arr[]=new int[size];
	
	System.out.println("enter elements");
	for(int i=0;i<arr.length;i++){
		 arr[i]=can.nextInt();
	}
	DescendingOrder des=new DescendingOrder();
	des.show(arr);

	}

}
