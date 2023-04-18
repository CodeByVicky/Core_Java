package com.Array;

import java.util.Scanner;

public class Acending {

	static void sort(int arr[]){
	//	Scanner can=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		
		}
		//System.out.println("enter large elemnt");
		//int large=2;
		int max=arr[arr.length-2];
		System.out.println(max);
		
		
	/*	for(int i:arr)
		{
			System.out.println(i);
		}
		*/
	}
	public static void main(String[] args) {
		
		int arr[]= {5,8,7,3,2,5};
		
		sort(arr);
	}

}
